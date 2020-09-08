package com.esmt.formation.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Rationnel> rationnels = new ArrayList<>();
		
		rationnels.add(new Rationnel(4,5));
		rationnels.add(new Rationnel(3,5));
		rationnels.add(new Rationnel(1,8));
		rationnels.add(new Rationnel(0,1));
		rationnels.add(new Rationnel(-4,3));
		rationnels.add(new Rationnel(8,6));
		rationnels.add(new Rationnel(4,7));
		
		System.out.println("Avant le tri :");
		for(Rationnel r: rationnels)
			r.affiche();
		System.out.println("Apres le tri");
		Collections.sort(rationnels);
		for(Rationnel r : rationnels)
			r.affiche();

	}
	
	
		
	

}
