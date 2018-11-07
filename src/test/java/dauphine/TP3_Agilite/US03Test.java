package dauphine.TP3_Agilite;


import static org.junit.Assert.assertEquals;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US03Test {
	private int jeton, fondCaisses;
	private Magasin magasin1;
	private Caisse caisse1;
	
	@Given("^somme de tous les fonds de caisse (\\d+) avec les jetons (\\d+) qu'on a dans le magasin$")
	public void somme_de_tous_les_fonds_de_caisse_avec_les_jetons_qu_on_a_dans_le_magasin(int jeton, int fondCaisses) throws Exception {
	   this.jeton=jeton;
	   this.fondCaisses=fondCaisses;
	}

	@When("^l'utilisateur décide d'avoir le total des fonds dans le magasin$")
	public void l_utilisateur_décide_d_avoir_le_total_des_fonds_dans_le_magasin() throws Exception {
		magasin1 =new Magasin(this.jeton);
		caisse1 =new Caisse("C1", this.fondCaisses, magasin1);
		magasin1.addCaisse(caisse1);
	  
	}

	@Then("^Total des fonds dans le magasin (\\d+)$")
	public void total_des_fonds_dans_le_magasin(int total) throws Exception {
	 assertEquals(total, magasin1.transactionMagasin());
	}

}
