package test.dao;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Client;
import metier.Conseiller;

public class listerClientsParConseiller {

	@Test
	public void testTailleCollectionClients() {
		 IDao dao = new DaoImpl();
		 // recuperation du conseiller de test
		Conseiller c = dao.verificationLogin("demo", "demo");
		
		Collection<Client> clients = dao.listerClientsParConseiller(c);
		
		Assert.assertEquals(4, clients.size());	
	}
	
	@Test
	public void testClientsAssociesConseiller() {
		 IDao dao = new DaoImpl();
		 // recuperation du conseiller de test
		Conseiller c = dao.verificationLogin("demo", "demo");
		
		Collection<Client> clients = dao.listerClientsParConseiller(c);
		
		Client cl = clients.iterator().next();
		
		Assert.assertTrue(c.getClients().contains(cl));	
	}
	

}
