package metier;

import javax.persistence.Entity;

@Entity
public class ClientEntreprise extends Client {

	private String nomEntreprise;

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
}
