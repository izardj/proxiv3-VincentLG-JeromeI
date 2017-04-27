package test.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Client;
import metier.Compte;
import metier.Conseiller;

public class listerComptesClient {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");
	
	@Test
	public void testTailleCollectionComptes() {
		IDao dao = new DaoImpl();
		
		EntityManager em = emf.createEntityManager();
		// chercher client id= 2
		Client c = em.find(Client.class, 2L);
		em.close();
		
		Collection<Compte> comptes = dao.listerComptesClient(c);
		
		Assert.assertEquals(2, comptes.size());	
	}
	
	@Test
	public void testComptesSontAssociesClient() {
		 IDao dao = new DaoImpl();
		 // recuperation du client de test
		 
		 EntityManager em = emf.createEntityManager();
		// chercher client de test
		Client c = em.find(Client.class, 2L);
		em.close();
		
		Collection<Compte> comptes = dao.listerComptesClient(c);
		
		Compte cl = comptes.iterator().next();
		
		Assert.assertTrue(c.getComptes().contains(cl));	
	}
	
	// Pasencore besoin de remonter au client depuis compte
	@Ignore
	@Test
	public void testClientAssocieCompte() {
		 IDao dao = new DaoImpl();
		 
		 EntityManager em = emf.createEntityManager();
		// chercher client de test
		Client c = em.find(Client.class, 2L);
		em.close();
		
		Collection<Compte> comptes = dao.listerComptesClient(c);
		
		Compte cl = comptes.iterator().next();
		
		Assert.assertEquals(c, cl.getClient());
	}

}
