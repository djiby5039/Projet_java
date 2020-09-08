package com.esmt.formation.java.run;

import com.esmt.formation.java.ComparateurSelonAge;
import com.esmt.formation.java.ComparateurSelonLeNom;
import com.esmt.formation.java.ComparateurSelonLeSexe;
import com.esmt.formation.java.Personne;
import com.esmt.formation.java.Rationnel;
import com.esmt.formation.java.Tableau;

public class Application {

	public static void main(String[] args) {
		Application app = new Application();
		app.demoCollection();
	}
	
	public void demoPersonne () {
		
		Personne [] pers = new Personne [5];
		pers[0] = new Personne (5, "Kiminou", 'F', 12);
		pers[1] = new Personne (3, "Dior", 'F', 11);
		pers[2] = new Personne (2, "Thiongane", 'H', 10);
		pers[3] = new Personne (4, "Jaffar", 'H', 8);
		pers[4] = new Personne (1, "Chaffai", 'F', 41);
		
		Tableau<Personne> personnes = new Tableau<>(pers);
		
		System.out.println("Avant le tri : ");
		personnes.affiche();
		
		// tri
		personnes.tri();
		
		System.out.println("\nAprès le tri : ");
		personnes.affiche();
	}
	
	public void demoRationnel () {
		Rationnel [] rats = new Rationnel [5];
		rats[0] = new Rationnel (2, 7);
		rats[1] = new Rationnel (3, 5);
		rats[2] = new Rationnel (-2, 3);
		rats[3] = new Rationnel (0, 9);
		rats[4] = new Rationnel (-7, 12);
		
		Tableau<Rationnel> rationnels = new Tableau<>(rats);
		
		System.out.println("Avant le tri : ");
		rationnels.affiche();
		
		// tri
		rationnels.tri();
		
		System.out.println("\nAprès le tri : ");
		rationnels.affiche();
	}
	
	public void demoCollection () {				
		com.esmt.formation.java.collections.Tableau<Personne> 
			personnes = new com.esmt.formation.java.collections.Tableau<>();
		
		personnes.add(new Personne (5, "Kiminou", 'F', 12));
		personnes.add(new Personne (3, "aly", 'F', 11));
		personnes.add(new Personne (2, "Thiongane", 'H', 10));
		personnes.add(new Personne (4, "Jaffar", 'H', 8));
		personnes.add(new Personne (1, "Chaffai", 'F', 41));
		
		System.out.println("Avant le tri : ");
		personnes.affiche();
		
		// tri par identifiant
		// tri naturel
		personnes.tri();
		System.out.println("\nAprès le tri (selon identifiant) : ");
		personnes.affiche();
		
		// tri selon l'age
		ComparateurSelonAge comparateurSelonAge = new ComparateurSelonAge();
		personnes.tri(comparateurSelonAge);
		System.out.println("\nAprès le tri (selon l'age) : ");
		personnes.affiche();
		
		// tri selon le nom
		ComparateurSelonLeNom comparateurSelonLeNom = new ComparateurSelonLeNom();
		personnes.tri(comparateurSelonLeNom);
		System.out.println("\nAprès le tri (selon le nom) : ");
		personnes.affiche();
		
		// tri selon le sexe
		ComparateurSelonLeSexe comparateurSelonLeSexe = new ComparateurSelonLeSexe();
		personnes.tri(comparateurSelonLeSexe);
		System.out.println("\nAprès le tri (selon le sexe) : ");
		personnes.affiche();
	}
}
