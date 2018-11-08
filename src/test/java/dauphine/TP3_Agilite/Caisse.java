package dauphine.TP3_Agilite;


import java.util.Random;

import dauphine.TP3_Agilite.Magasin;

public class Caisse {
	
	 Magasin m ;
		private String nom ;
		private int fondCaisse=0 ;
		private int  panne;
		Random random=new Random ();
		
		
		public Caisse(String nom,int fondCaisse,Magasin ma) {
	       this.nom=nom;
	       this.fondCaisse=fondCaisse;
	       this.m= ma;
	       this.panne=random.nextInt(100 +1 -0)+0;
		}
		

		
  public int getTotal(){
  return this.fondCaisse;	
		}

  public String getName(){
  return this.nom;	
		} 
  public void setTotal(int nb){
  this.fondCaisse=nb;
		}
  public void setNom(String name){
  this.nom=name;
		}
  public int getPanne(){
	  
	  return this.panne;
  }
  public void setPanne(int panne){
	  this.panne=panne;
  }

   public int transaction(){
   int x= sommeTot();
   ouvertureMag();
   return x;
	}
		
    public int sommeTot(){	
	return m.getJeton() + this.fondCaisse;	
		}
		// test ouverture Magasin 
	public void ouvertureMag(){
	if (this.sommeTot()>=1000){
	  m.setOuvert(false);
		   } else {
		  m.setOuvert(true);
		    }
		}
	public boolean estVide(){		
	if (sommeTot()<=0) return true ;
	 	else {
		return false;} 
	
			
	}
			                    	
		
  public boolean estOuverte(){
	  return (transaction() !=100);
 // if (transaction()==100) return false;
  //return true ;
			}	

	public String toString(){		
	return " Caisse :"+this.nom+" Fond de la Caisse : "+this.fondCaisse; 
	}
	
   public Magasin getMagasin(){
	   return this.m;
   }
   public void setMagasin(Magasin m){
    this.m=m;
   }

   
   public boolean caissePanne(){
	   if(this.panne>=80){
		   return true;
	   }else {
		   return false;
	   }
	   
   }
 
   //methode qui permet de reparer une caisse en Panne
   public void reparPanne(){
	
	   if (this.panne>=80){
		   this.panne= random.nextInt(50 +1 -0)+0; 
	   }
   }
   
 

}
