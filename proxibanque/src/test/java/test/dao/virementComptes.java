package test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Compte;
import metier.CompteCourant;
import metier.CompteEpargne;

public class virementComptes {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");
	
	@Test
	public void testSoldeCompteDebiteurModifie() {
		IDao dao = new DaoImpl();
		
		// récupérer comptes de test
		EntityManager em = emf.createEntityManager();
		Compte cD = em.find(Compte.class, 1L); // solde initial = 2000
		Compte cC = em.find(Compte.class, 4L);// solde initial = 20000
		em.close();
		
		
		dao.virementComptes(cD, cC, 1000);
		
		EntityManager em2 = emf.createEntityManager();
		cD = em2.find(Compte.class, 1L);
		em2.close();
		
		Assert.assertEquals(1000, cD.getSolde(), 0);
		
		// restauration des soldes
		EntityManager em3 = emf.createEntityManager();
		EntityTransaction tx = em3.getTransaction();
		CompteCourant c1 = em3.find(CompteCourant.class, 1L);
		CompteEpargne c4 = em3.find(CompteEpargne.class, 4L);
		tx.begin();
		c1.setSolde(2000);
		c4.setSolde(20000);
		em3.merge(c1);
		em3.merge(c4);
		tx.commit();
		em3.close();
		
	}

	@Test
	public void testSoldeCompteCrediteurModifie() {
		IDao dao = new DaoImpl();
		
		// récupérer comptes de test
		EntityManager em = emf.createEntityManager();
		Compte cD = em.find(Compte.class, 1L); // solde initial = 2000
		Compte cC = em.find(Compte.class, 4L);// solde initial = 20000
		em.close();
		
		
		dao.virementComptes(cD, cC, 1000);
		
		EntityManager em2 = emf.createEntityManager();
		cC = em2.find(Compte.class, 4L);
		em2.close();
		
		Assert.assertEquals(21000, cC.getSolde(), 0);
		
		// restauration des soldes
		EntityManager em3 = emf.createEntityManager();
		EntityTransaction tx = em3.getTransaction();
		CompteCourant c1 = em3.find(CompteCourant.class, 1L);
		CompteEpargne c4 = em3.find(CompteEpargne.class, 4L);
		tx.begin();
		c1.setSolde(2000);
		c4.setSolde(20000);
		em3.merge(c1);
		em3.merge(c4);
		tx.commit();
		em3.close();
	}

}
