package test.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AfficherConseiller.class, GetCompteParId.class, ListerAutresComptes.class,
		ListerClientsParConseiller.class, ListerComptesClient.class, ModifierClient.class, RetourneClientParId.class,
		VerificationLogin.class, VirementComptes.class })
public class AllTests {

}
