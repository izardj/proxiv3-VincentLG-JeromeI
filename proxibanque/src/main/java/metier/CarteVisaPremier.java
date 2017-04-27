package metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VISAPREMIER")
public class CarteVisaPremier extends CarteBancaire {

	public CarteVisaPremier(Compte compte) {
		super(compte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VisaPremier []";
	}

}
