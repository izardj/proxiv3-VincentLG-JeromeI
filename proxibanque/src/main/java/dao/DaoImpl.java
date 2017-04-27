package dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import metier.Client;
import metier.Compte;
import metier.Conseiller;

public class DaoImpl implements IDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proxiv3-pu");

	@Override
	public Conseiller verificationLogin(String login, String pwd) {
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT c FROM Conseiller c WHERE c.login = :login AND c.pwd = :pwd");
		query.setParameter("login", login);
		query.setParameter("pwd", pwd);

		Conseiller conseiller = null;
		List<Conseiller> results = query.getResultList();
		if (!results.isEmpty()) {
			conseiller = (Conseiller) results.get(0);
		}

		em.close();
		return conseiller;

	}

	@Override
	public Collection<Client> listerClientsParConseiller(Conseiller conseiller) {
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT c FROM Client c WHERE c.conseiller = :conseiller");
		query.setParameter("conseiller", conseiller);

		Collection<Client> clients = query.getResultList();
		conseiller.setClients(clients);
		em.close();
		return clients;
	}

	@Override
	public void modifierClient(Client client) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		em.merge(client);
		tx.commit();

		em.close();
	}

	@Override
	public Collection<Compte> listerComptesClient(Client client) {
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT c FROM Compte c WHERE c.client = :client");
		query.setParameter("client", client);

		Collection<Compte> comptes = query.getResultList();
		client.setComptes(comptes);
		em.close();
		return comptes;
	}

	@Override
	public Client retourneClientParId(long idClient) {
		EntityManager em = emf.createEntityManager();
		
		Client client = em.find(Client.class, idClient);

		em.close();
		
		return client;
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
	public int virementComptes(Compte compteDebiteur, Compte compteCrediteur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Conseiller afficherConseiller(long idConseiller) {
		// TODO Auto-generated method stub
		return null;
	}

}
