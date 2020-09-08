package com.app.produit.run;

import com.app.produit.entities.Produit;
import com.app.produit.types.Type;

public class Application {
	
	static double somme = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produit[] panier = new Produit[20];
		panier[0] = new Produit();
		for(int i=1 ;i< 20 ; i++) {
			panier[i] = new Produit(i+1, 2*i, Produit.PRIX_UNITAIRE*i, Type.ALIMENTAIRE);
		}
          for(Produit P: panier) {
        	  P.affiche();
        	  
        	  somme+=P.getPrix();
        	  }
          System.out.println("LA SOMME DU PANIER DONNE "+somme);
	}
	 
	

}
