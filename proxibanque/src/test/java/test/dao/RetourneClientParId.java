package test.dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Client;

public class RetourneClientParId {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");

	@Test
	public void testRetourneUnClient() {
		IDao dao = new DaoImpl();

		Client c = dao.retourneClientParId(2);
		
		Assert.assertEquals("ZEZE", c.getNom());
	}
	
	@Test
	public void testRetourneUnClientAvecSonAdresse() {
		IDao dao = new DaoImpl();

		Client c = dao.retourneClientParId(2);
		
		Assert.assertEquals("GENAS", c.getAdresse().getVille());
	}
	

}
