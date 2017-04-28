package test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Client;

public class ModifierClient {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");
	
	@Test
	public void test() {
		IDao dao = new DaoImpl();
		
		EntityManager em = emf.createEntityManager();
		// chercher client id= 2  avec nom original = ZEZE
		Client c = em.find(Client.class, 2L);
		c.setNom("NomTest");
		em.close();
		
		dao.modifierClient(c);
		
		EntityManager em2 = emf.createEntityManager();
		Client c2 = em2.find(Client.class, 2L);
		Assert.assertEquals("NomTest", c2.getNom());
		
		// restaure le client
		EntityTransaction tx = em2.getTransaction();
		tx.begin();
		c2.setNom("ZEZE");
		em2.merge(c2);
		tx.commit();
		em2.close();
		
	}

}
