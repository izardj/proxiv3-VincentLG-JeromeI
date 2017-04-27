package metier;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public abstract class Client extends Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long idClient;
	private Collection<Compte> comptes = new ArrayList<Compte>();
	private Collection<Placement> placements = new ArrayList<Placement>();
	private Conseiller conseiller;

	public Client() {
		super();
	}

	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String telephone,
			int idClient, boolean entreprise, String nomEntreprise, Collection<Compte> comptes,
			Collection<Placement> placements, Conseiller conseiller) {
		super(nom, prenom, adresse, codePostal, ville, telephone);
		this.idClient = idClient;
		this.comptes = comptes;
		this.placements = placements;
		this.conseiller = conseiller;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	public Collection<Placement> getPlacements() {
		return placements;
	}

	public void setPlacements(Collection<Placement> placements) {
		this.placements = placements;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}

	@Override
	public String getPrenom() {
		// TODO Auto-generated method stub
		return super.getPrenom();
	}

	@Override
	public void setPrenom(String prenom) {
		// TODO Auto-generated method stub
		super.setPrenom(prenom);
	}

	@Override
	public String getAdresse() {
		// TODO Auto-generated method stub
		return super.getAdresse();
	}

	@Override
	public void setAdresse(String adresse) {
		// TODO Auto-generated method stub
		super.setAdresse(adresse);
	}

	@Override
	public String getCodePostal() {
		// TODO Auto-generated method stub
		return super.getCodePostal();
	}

	@Override
	public void setCodePostal(String codePostal) {
		// TODO Auto-generated method stub
		super.setCodePostal(codePostal);
	}

	@Override
	public String getVille() {
		// TODO Auto-generated method stub
		return super.getVille();
	}

	@Override
	public void setVille(String ville) {
		// TODO Auto-generated method stub
		super.setVille(ville);
	}

	@Override
	public String getTelephone() {
		// TODO Auto-generated method stub
		return super.getTelephone();
	}

	@Override
	public void setTelephone(String telephone) {
		// TODO Auto-generated method stub
		super.setTelephone(telephone);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Client [entreprise=" + entreprise + ", nomEntreprise=" + nomEntreprise + ", comptes=" + comptes
				+ ", placements=" + placements + ", conseiller=" + conseiller + "]";
	}

}
