package mbeans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import metier.Compte;
import service.IServiceConseiller;
import service.ServiceImpl;

@ManagedBean
@SessionScoped
public class VirementBean {

	private IServiceConseiller service = new ServiceImpl();
	private Compte compteDebiteur;
	private Compte compteCrediteur;
	private long idCompteCrediteur;
	private double montant;
	private Collection<Compte> autresComptes;

	public IServiceConseiller getService() {
		return service;
	}


	public void setService(IServiceConseiller service) {
		this.service = service;
	}


	public Compte getCompteDebiteur() {
		return compteDebiteur;
	}


	public void setCompteDebiteur(Compte compteDebiteur) {
		this.compteDebiteur = compteDebiteur;
	}


	public Compte getCompteCrediteur() {
		return compteCrediteur;
	}


	public void setCompteCrediteur(Compte compteCrediteur) {
		this.compteCrediteur = compteCrediteur;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public long getIdCompteCrediteur() {
		return idCompteCrediteur;
	}


	public void setIdCompteCrediteur(long idCompteCrediteur) {
		this.idCompteCrediteur = idCompteCrediteur;
	}


	public String afficherVirement(){
		autresComptes = service.listerAutresComptes(compteDebiteur.getNumeroCompte());
		return "virement";
	}
		
	
	public String effectuerVirement(){
		compteCrediteur= service.getCompteParId(idCompteCrediteur);
		if(service.virementComptes(compteDebiteur, compteCrediteur, montant)){
			// message OK
		}
		else{
			// message echoué
		}
		return "virement";
	}


	public Collection<Compte> getAutresComptes() {
		return autresComptes;
	}


	public void setAutresComptes(Collection<Compte> autresComptes) {
		this.autresComptes = autresComptes;
	}
	
}
