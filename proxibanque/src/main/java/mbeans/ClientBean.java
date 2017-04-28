package mbeans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import metier.Client;
import metier.Conseiller;
import service.IServiceConseiller;
import service.ServiceImpl;


@ManagedBean
@SessionScoped
public class ClientBean {
	
	private IServiceConseiller service = new ServiceImpl(); 
	
	private Collection<Client> clients = new ArrayList<Client>();
	
	private Client client = new Client();
	
	@ManagedProperty(value="#{conseillerBean}")
	private ConseillerBean conseillerBean;
	
	

	public IServiceConseiller getService() {
		return service;
	}

	public void setService(IServiceConseiller service) {
		this.service = service;
	}

	public Collection<Client> getClients() {
		clients = service.listerClientsParConseiller(conseillerBean.getConseiller());
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ConseillerBean getConseillerBean() {
		return conseillerBean;
	}

	public void setConseillerBean(ConseillerBean conseillerBean) {
		this.conseillerBean = conseillerBean;
	}
	
	public String afficherDetails(){
		return "detailsClient";
	}
	
	
	

}
