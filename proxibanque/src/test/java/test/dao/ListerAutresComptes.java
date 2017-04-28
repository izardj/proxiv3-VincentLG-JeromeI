package test.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Client;
import metier.Compte;

public class ListerAutresComptes {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");
	
	@Test
	public void testAutresComptesContientPasCompte1() {
		IDao dao = new DaoImpl();
		
		// recuperation du compte 1
		EntityManager em = emf.createEntityManager();
		Compte c = em.find(Compte.class, 1L);
		em.close();
		
		// recuperer tous les comptes sauf le compte 1
		Collection<Compte> comptes = dao.listerAutresComptes(c.getNumeroCompte());
		
		Assert.assertFalse(comptes.contains(c));		
	}
	
	@Test
	public void testTailleListeComptesMoinsUn() {
		IDao dao = new DaoImpl();
		
		// recuperation du compte 1
		EntityManager em = emf.createEntityManager();
		Compte c = em.find(Compte.class, 1L);

		// nombre de comptes en base
		Query q = em.createQuery("SELECT COUNT(c.id)FROM Compte c");
		long tailleComptes = (long)q.getSingleResult();
		em.close();
		
		// recuperer tous les comptes sauf le compte 1
		Collection<Compte> comptes = dao.listerAutresComptes(c.getNumeroCompte());
		
		Assert.assertEquals(tailleComptes-1, comptes.size());		
	}
	

}
