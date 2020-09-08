package com.esmt.formation.java;

import java.util.ArrayList;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Rationnel> rationnels =new ArrayList<>();
		
		//ajout des element da la collection
		try {
			rationnels.add(new Rationnel(1,0 ));
			 
		}catch(IllegalArgumentException e){
			   System.out.println("ON VOUS PREVIENS QUE"+e.getMessage());
			
		}
		
		rationnels.add(new Rationnel(7, 9));
		rationnels.add(new Rationnel(0, 1));
		rationnels.add(new Rationnel(0, 1));
		rationnels.add(new Rationnel(2, 3));
		rationnels.add(new Rationnel(-1, 5));
		
		System.out.println("avant le tri: ");
		for(Rationnel r: rationnels)
			r.afficher();
		
		System.out.println("apres le tri: ");
		Collections.sort(rationnels);
		for(Rationnel r: rationnels)
			r.afficher();	
		
		
		
		

	}
	
	
	
	

}
