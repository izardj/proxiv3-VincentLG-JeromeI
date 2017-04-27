package test.dao;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Conseiller;

public class afficherConseiller {

	@Test
	public void testRetourneUnConseiller() {
		IDao dao = new DaoImpl();
		
		Conseiller c = dao.afficherConseiller(1);
		
		Assert.assertEquals("Robichet", c.getNom());
	}
	
	@Test
	public void testConseillerInexistant() {
		IDao dao = new DaoImpl();
		
		Conseiller c = dao.afficherConseiller(999999);
		
		Assert.assertEquals(null, c);
	}

}
