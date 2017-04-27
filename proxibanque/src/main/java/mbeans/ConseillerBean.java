package mbeans;


import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import metier.Conseiller;
import service.IServiceConseiller;

@Named
@SessionScoped
public class ConseillerBean {

	@Inject
	IServiceConseiller service;
	Conseiller conseiller = new Conseiller();

	public IServiceConseiller getService() {
		return service;
	}

	public void setService(IServiceConseiller service) {
		this.service = service;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public String connexion() {

		if (service.verificationLogin(conseiller.getLogin(), conseiller.getPwd()) == null) {
			// message erreur
			return "index";
		} else {
			return "listeClients";
		}
	}
}
