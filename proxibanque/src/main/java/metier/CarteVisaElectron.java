package metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VISAELECTRON")
public class CarteVisaElectron extends CarteBancaire {

	public CarteVisaElectron(Compte compte) {
		super(compte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VisaElectron []";
	}

}
