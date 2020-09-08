package com.esmt.formation.java.runtime;

import com.esmt.formation.java.exceptions.ConstructorException;
import com.esmt.formation.java.exceptions.DifferenceException;
import com.esmt.formation.java.exceptions.SommeException;
import com.esmt.formation.java.objects.EntierNaturel;

public class EntierNaturelRun {

	public static void main(String[] args) {
		EntierNaturelRun app = new EntierNaturelRun();
		app.differenceDemo();
	}
	
	public void differenceDemo () {		
		try {
			
			EntierNaturel n1 = new EntierNaturel(Integer.MAX_VALUE);
			EntierNaturel n2 = new EntierNaturel(1);
			
			EntierNaturel resultat = EntierNaturel.difference(n1, n2);
			System.out.println("La différence : " + resultat.getValue());
			
		} catch (ConstructorException e) {
			System.err.println("An error occured : " + e.getMessage() + 
					" with value " + e.getValue());
		} catch (DifferenceException e) {
			System.err.println("An error occured : " + e.getMessage());
		}
	}
	
	public void sommeDemo () {
		
		try {
			
			EntierNaturel n1 = new EntierNaturel(Integer.MAX_VALUE - 1);
			EntierNaturel n2 = new EntierNaturel(1);
			
			EntierNaturel resultat = EntierNaturel.somme(n1, n2);
			System.out.println("La somme : " + resultat.getValue());
			
		} catch (ConstructorException e) {
			System.err.println("An error occured : " + e.getMessage() + 
					" with value " + e.getValue());
		} catch (SommeException e) {
			System.err.println("An error occured : " + e.getMessage());
		}
	}

}
