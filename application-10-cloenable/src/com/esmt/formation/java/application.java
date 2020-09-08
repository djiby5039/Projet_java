package com.esmt.formation.java;

public class application {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		
		
	}
	
	public void demoCloneable_1() {
		
		Personne  personne = new Personne("Ndeye" , "Ndiaye" , 28);
		   
	     Personne cloneDePersonne = personne;
	     
	     personne.presenteToi();
	     cloneDePersonne.presenteToi();

	}
	
	public void demoCloneable_2() {
		
		Personne  personne = new Personne("Ndeye" , "Ndiaye" , 28);
		personne.presenteToi();
		try {
			Personne personneDeClone =  (Personne) personne.clone();
			personneDeClone.presenteToi();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	   
	}

}
