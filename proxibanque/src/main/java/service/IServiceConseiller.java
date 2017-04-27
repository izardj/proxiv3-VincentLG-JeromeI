package service;

import java.util.Collection;

import metier.Client;
import metier.Compte;
import metier.Conseiller;

public interface IServiceConseiller {

	/**
	 * retourne la liste de clients d'un conseiller
	 * 
	 * @param conseiller
	 *            Conseiller dont on veux la liste de clients
	 * @return la liste de client du conseiller
	 */
	public Collection<Client> listerClientsParConseiller(Conseiller conseiller);
	
	/**
	 * modifie le client
	 * 
	 * @param client
	 *            client à modifier
	 * @return retourne le nombre de lignes modifiées
	 */
	public int modifierClient(Client client);
	
	/**
	 * Récupère les comptes associés à un client
	 * @param client Le client dont on veut les comptes
	 * @return Les comptes du client
	 */
	public Collection<Compte> listerComptesClient(Client client);
		
	/**
	 * Retourne un client correspondant a l'Id
	 * 
	 * @param idClient
	 *            id du client à retourner
	 * @return client correspondant à l'id
	 */
	public Client retourneClientParId(long idClient);
	
	/**
	 * Retourne un compte selectionné par son id
	 * 
	 * @param idCompte
	 *            identifiant du compte à retourner
	 * @return compte correspondant à l'Id
	 */
	public Compte getCompteParId(long idCompte);

	/**
	 * Récupère tous les comptes de l'agence sauf le compte donné en argument
	 * 
	 * @param idCompte identifiant du compte à exclure des comptes retournés
	 * 
	 * @return une collection de comptes de l'agence
	 */
	public Collection<Compte> listerAutresComptes(long idCompte);
	
	/**
	 * Met à jour les comptes lors d'un virement
	 * @param compteDebiteur Compte débité
	 * @param compteCrediteur Compte crédité
	 * @param montant Somme à virer
	 * @return retourne le nombre de lignes modifiées
	 */
	public int virementComptes(Compte compteDebiteur, Compte compteCrediteur, double montant);
	
	/**
	 * retourne le conseiller corespondant a l'Id
	 * 
	 * @param idConseiller
	 *            id du conseiller à retourner
	 * @return conseiller corespondant à l'Id
	 */
	public Conseiller afficherConseiller(long idConseiller);
	
	
}
