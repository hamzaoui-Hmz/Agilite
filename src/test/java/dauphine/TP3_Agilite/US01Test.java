package dauphine.TP3_Agilite;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class US01Test {

	private int jeton ;
	Magasin m ;
	private String etat;
	
	public String estOuvert(){
		
		if (m.getOuvert()==false) return "NO";
		return "YES";
	}
	


@Given("^La création dun magasin comprenant (\\d+)$")
public void la_création_dun_magasin_comprenant(String jeton)  {
    this.jeton= Integer.parseInt(jeton);
   
}

@When("^l'utilisateur décide de créer un magasin$")
public void l_utilisateur_décide_de_créer_un_magasin()  {
    m=new Magasin(jeton);
    
}

@Then("^Création du magasin$")
public void création_du_magasin()  {
    assertEquals(jeton, m.getJeton());
    
}

@Given("^voir letat du magasin which si elle est ouverte ou YES$")
public void voir_letat_du_magasin_which_si_elle_est_ouverte_ou_YES() throws Exception {
    this.jeton=10;
    
}

@When("^lutilisateur Décide de modifier louverture du magasin NO$")
public void lutilisateur_Décide_de_modifier_louverture_du_magasin_NO() throws Exception {
        m = new Magasin(this.jeton);
        m.setOuvert(false);   // resopnsable ferme le magasin 
   
}

@Then("^état du magasin est modifié$")
public void état_du_magasin_est_modifié() throws Exception {
   assertEquals("NO", estOuvert());   // le magasin est fermer 
  
}
}