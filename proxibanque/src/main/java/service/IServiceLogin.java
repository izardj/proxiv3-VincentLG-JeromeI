package service;

import metier.Conseiller;

public interface IServiceLogin {

	/**
	 * Méthode qui retourne un conseiller grace à son login et son mdp
	 * 
	 * @param login
	 *            identifiant
	 * @param pwd
	 *            mots de passe
	 * @return retourne le conseiller
	 */
	public Conseiller verificationLogin(String login, String pwd);
}
