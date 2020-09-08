package com.esmt.formation.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Personne> personnes = new ArrayList<>();
       personnes.add(new Personne(5,"Bousso",'F',15));
       personnes.add(new Personne(2,"titi",'F',1));
       personnes.add(new Personne(8,"toto",'H',18));
       personnes.add(new Personne(4,"jamal",'H',105));
       personnes.add(new Personne(50,"sokhna",'F',150));
       personnes.add(new Personne(45,"omar",'H',85));
       
       System.out.println("Avant tri");
       
       for(Personne personne : personnes) {
    	   personne.print();
       }
       Collections.sort(personnes);
       
       
       
       System.out.println("Apres tri");
       
       for(Personne personne : personnes) {
    	   personne.print();
       }
       System.out.println("comparaison avec le nom");
       
       ComparateurSelonLeNom comparateur = new ComparateurSelonLeNom();
       Collections.sort(personnes, comparateur);
	
	 for(Personne personne : personnes) {
  	   personne.print();
     }
	 
	 
	 System.out.println("comparaison avec l'age");
     
     ComparaisonSelonLage comparateur1 = new ComparaisonSelonLage();
     Collections.sort(personnes, comparateur1);
	
	 for(Personne personne : personnes) {
	   personne.print();
   }
	 
	}

}
