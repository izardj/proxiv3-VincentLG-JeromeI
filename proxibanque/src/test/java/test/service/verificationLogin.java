package test.service;

import org.junit.Assert;
import org.junit.Test;

import metier.Conseiller;
import service.IServiceConseiller;
import service.ServiceImpl;

public class verificationLogin {

	@Test
	public void testConseillerExiste() {
		IServiceConseiller service = new ServiceImpl();
		
		Conseiller c = service.verificationLogin("demo", "demo");
		
		Assert.assertEquals("Robichet", c.getNom());
	}
	
	@Test
	public void testConseillerNexistePas() {
		IServiceConseiller service = new ServiceImpl();
		
		Conseiller c = service.verificationLogin("fefe", "fefe");
		
		Assert.assertEquals(null, c);
	}
	
	

}
