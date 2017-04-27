package test.dao;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.Conseiller;

public class verificationLogin {

	@Test
	public void testConseillerExiste() {

		IDao dao = new DaoImpl();
		
		Conseiller c = dao.verificationLogin("demo", "demo");
		Assert.assertEquals("Roger", c.getNom());
	}
	

}
