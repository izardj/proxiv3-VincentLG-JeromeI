package service;

import javax.inject.Inject;

import dao.IDao;
import metier.Conseiller;

public class ServiceImpl implements IServiceLogin {

	@Inject
	private IDao dao;
	
	@Override
	public Conseiller verificationLogin(String login, String pwd) {
		return dao.verificationLogin(login, pwd);
	}

}
