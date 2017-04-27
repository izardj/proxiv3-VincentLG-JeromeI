package service;

import java.util.Collection;

import javax.inject.Inject;

import dao.IDao;
import metier.Client;
import metier.Compte;
import metier.Conseiller;

public class ServiceImpl implements IServiceConseiller {

	@Inject
	private IDao dao;
	
	@Override
	public Conseiller verificationLogin(String login, String pwd) {
		return dao.verificationLogin(login, pwd);
	}

	@Override
	public Collection<Client> listerClientsParConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifierClient(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Compte> listerComptesClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client retourneClientParId(long idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte getCompteParId(long idCompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Compte> listerAutresComptes(long idCompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int virementComptes(Compte compteDebiteur, Compte compteCrediteur, double montant) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Conseiller afficherConseiller(long idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

}
