package metier;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("CLIENT")
public abstract class Client extends Personne {
	
	
	@OneToMany
	private Collection<Compte> comptes = new ArrayList<Compte>();
	@OneToMany
	private Collection<Placement> placements = new ArrayList<Placement>();
	@ManyToOne
	private Conseiller conseiller;

	public Client() {
		super();
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

	public Client(long idPersonne, String nom, String prenom, String telephone, String email) {
		super(idPersonne, nom, prenom, telephone, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Client [comptes=" + comptes + ", placements=" + placements + ", conseiller=" + conseiller + "]";
	}

	
}
