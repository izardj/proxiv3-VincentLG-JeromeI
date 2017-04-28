package test.dao;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Conseiller;

public class VerificationLogin {

	@Test
	public void testConseillerExiste() {

		IDao dao = new DaoImpl();
		
		Conseiller c = dao.verificationLogin("demo", "demo");
		Assert.assertEquals("Robichet", c.getNom());
	}
	
	@Test
	public void testConseillerExistePas() {

		IDao dao = new DaoImpl();
		
		Conseiller c = dao.verificationLogin("ExistePAs", "ExistePAs");
		Assert.assertEquals(null, c);
	}

}
