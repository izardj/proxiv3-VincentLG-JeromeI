package test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import junit.framework.TestCase;
import metier.Conseiller;

public class creationBDD extends TestCase {

	@Test
	public void testBDD() {
		Conseiller c = new Conseiller();
		c.setLogin("demo");
		c.setPwd("demo");
		c.setNom("Roger");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
		
		
	}
	

}
