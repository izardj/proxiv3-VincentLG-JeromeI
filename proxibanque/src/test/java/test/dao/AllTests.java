package test.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ afficherConseiller.class, getCompteParId.class, listerAutresComptes.class,
		listerClientsParConseiller.class, listerComptesClient.class, modifierClient.class, retourneClientParId.class,
		verificationLogin.class, virementComptes.class })
public class AllTests {

}
