package service;

import java.util.Collection;

import dao.DaoImpl;
import dao.IDao;
import metier.Client;
import metier.Compte;
import metier.Conseiller;

public class ServiceImpl implements IServiceConseiller {

	// @Inject
	private IDao dao = new DaoImpl();

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
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
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
	public void virementComptes(Compte compteDebiteur, Compte compteCrediteur, double montant) {
		// TODO Auto-generated method stub
	}

	@Override
	public Conseiller afficherConseiller(long idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

}
