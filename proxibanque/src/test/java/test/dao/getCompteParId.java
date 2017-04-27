package test.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Test;

import dao.DaoImpl;
import dao.IDao;
import metier.CompteCourant;
import metier.CompteEpargne;

public class getCompteParId {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");
	
	@Test
	public void testRetourneUnCompteCourant() {
		IDao dao = new DaoImpl();

		CompteCourant c = (CompteCourant) dao.getCompteParId(1L);
		
		Assert.assertEquals("2009-12-05",c.getDateOuverture());
	}
	
	@Test
	public void testRetourneUnCompteEpargne() {
		IDao dao = new DaoImpl();

		CompteEpargne c = (CompteEpargne) dao.getCompteParId(4L);
		
		Assert.assertEquals("2008-01-30",c.getDateOuverture());
	}

}
