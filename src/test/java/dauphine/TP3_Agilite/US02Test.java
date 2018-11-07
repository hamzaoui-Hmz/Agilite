package dauphine.TP3_Agilite;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dauphine.TP3_Agilite.Caisse;
import dauphine.TP3_Agilite.Magasin;

public class US02Test {

	
	private Caisse caisse1, caisse2; 
	private Magasin magasin1;
	private Magasin magasin2;
	
	@Given("^La vérification  dune caisse dans un magasin   comprenant$")
	public void la_vérification_dune_caisse_dans_un_magasin_comprenant() throws Exception {
      
	}

	@When("^l'utilisateur souhaite vérifier une caisse dans un magasin$")
	public void l_utilisateur_souhaite_vérifier_une_caisse_dans_un_magasin() throws Exception {
	   magasin1=new Magasin(100);
	   magasin2=new Magasin(50);
	   
	   this.caisse1=new Caisse("caisse1", 70, magasin1);
	   this.caisse2=new Caisse("caisse2", 70, magasin2);
	   magasin1.addCaisse(caisse1);
	}

	@Then("^La caisse est attribuer dans ce Magsin$")
	public void la_caisse_est_attribuer_dans_ce_Magsin() throws Exception {
	
	   assertEquals(false, this.magasin1.testRelation(caisse1)); // permet de verfier si une caisse existe dans magasin1
	   assertEquals(false, this.magasin1.testRelation(caisse2));
	   
	   
	   
	}

	@Given("^étant donnée une caisse$")
	public void étant_donnée_une_caisse() throws Exception {
	  
	}

	@When("^l'utilisateur décide de vérifier si la caisse est ouverte ou pas$")
	public void l_utilisateur_décide_de_vérifier_si_la_caisse_est_ouverte_ou_pas() throws Exception {
	   magasin1= new Magasin(30);
	   this.caisse1=new Caisse("c1", 40, magasin1);
	}

	@When("^la transaction$")
	public void la_transaction() throws Exception {
		l_utilisateur_décide_de_vérifier_si_la_caisse_est_ouverte_ou_pas();
		caisse1.transaction();
		   
	}

	@When("^vérifier le fond de la ciasse aprés une transaction$")
	public void vérifier_le_fond_de_la_ciasse_aprés_une_transaction() throws Exception {
		la_transaction();
		magasin1.fondMagasin();
	}
 
	@Then("^renvoie l'état de la caisse\\(ouverte ou pas\\)$")
	public void renvoie_l_état_de_la_caisse_ouverte_ou_pas() throws Exception {
		assertEquals(true, caisse1.estOuverte());
	   
	}
	

	@Given("^étant donne une caisse existante$")
	public void étant_donne_une_caisse_existante() throws Exception {
		
      
	}

	@When("^quand l'utilisateur souhaite verifier la panne d'une caisse$")
	public void quand_l_utilisateur_souhaite_verifier_la_panne_d_une_caisse() throws Exception {
	  magasin2 = new Magasin(30);
	  caisse2 =new Caisse("c2", 40, magasin2);
	  
	}

	@Then("^l'état de la caisse est renvoyée$")
	public void l_état_de_la_caisse_est_renvoyée() throws Exception {
		quand_l_utilisateur_souhaite_verifier_la_panne_d_une_caisse();
		if( caisse2.getPanne()>=80){                  // true = en panne     // false == elle n'est pas en panne
		 assertEquals(true, caisse2.caissePanne());  // la caisse est en panne
		} else{
			assertEquals(false, caisse2.caissePanne()); // la caisse n`est pas en panne 
		}
		
	  
	}

	@Given("^étant donnée une caisse qui est en panne$")
	public void étant_donnée_une_caisse_qui_est_en_panne() throws Exception {
	  
	}

	@When("^l'utilisateur décide réparer la caisse$")
	public void l_utilisateur_décide_réparer_la_caisse() throws Exception {
	    caisse2 = new Caisse("c2", 40, magasin1);
	    caisse2.reparPanne();
	}

	@Then("^la caisse est réparé$")
	public void la_caisse_est_réparé() throws Exception {
		
	  assertEquals(false, caisse2.caissePanne());   // qui veut dire que la caisse n'est pas en panne 
	}
	
}
