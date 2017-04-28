package mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import metier.Conseiller;
import service.IServiceConseiller;
import service.ServiceImpl;

//@Named
@ManagedBean(eager=true)
@SessionScoped
public class ConseillerBean {

	
	private IServiceConseiller service = new ServiceImpl();
	private Conseiller conseiller = new Conseiller();

	
	
	
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
		conseiller = service.verificationLogin(conseiller.getLogin(), conseiller.getPwd());
		if (conseiller == null) {
			// message erreur
			return "index";
		} else {
			return "listeClients";
		}
	}
	
	public String deconnexion(){
		conseiller = null;
		return "index";
		
	}
	
}
