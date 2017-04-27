package metier;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conseiller extends Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long idConseiller;
	private String login;
	private String pwd;

	public long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	private Collection<Client> clients = new ArrayList<Client>();
	private Gerant gerant;

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public Conseiller(Collection<Client> clients, Gerant gerant) {
		super();
		this.clients = clients;
		this.gerant = gerant;
	}

	public Conseiller(Collection<Client> clients) {
		super();
		this.clients = clients;
	}

	public Conseiller() {
		super();
	}

	@Override
	public String toString() {
		return "Conseiller [clients=" + clients + "]";
	}

}
