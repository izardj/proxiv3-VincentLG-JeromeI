package test.service;

import org.junit.Assert;
import org.junit.Test;

import metier.CompteCourant;
import metier.CompteEpargne;
import service.IServiceConseiller;
import service.ServiceImpl;

public class VirementComptes {

	@Test
	public void testVirementMontantNegatif() {
		
		IServiceConseiller service = new ServiceImpl();
		CompteCourant cc = new CompteCourant();
		CompteEpargne ce = new CompteEpargne();
			
		Assert.assertFalse(service.virementComptes(cc, ce,-500));
	}

	@Test
	public void testVirementCompteCourantSoldeInsuffisant() {
		
		IServiceConseiller service = new ServiceImpl();
		CompteCourant cc = new CompteCourant();
		CompteEpargne ce = new CompteEpargne();
		
		cc.setSolde(1000);
		cc.setDecouvert(500);
		
		Assert.assertFalse(service.virementComptes(cc, ce,2000));
	}
	
	@Test
	public void testVirementCompteEpargneSoldeInsuffisant() {
		
		IServiceConseiller service = new ServiceImpl();
		CompteCourant cc = new CompteCourant();
		CompteEpargne ce = new CompteEpargne();
		
		ce.setSolde(1000);
		
		Assert.assertFalse(service.virementComptes(cc, ce,2000));
	}
	
	
}
