package com.esmt.formation.java;

public class Enseignant implements Autorisation {
	
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param nom
	 */
	public Enseignant(String nom) {
		this.nom = nom;
	}
	
	
	public void inscrire() {
		// TODO Auto-generated method stub
		System.out.println("je veux  m'inscrire");
		
	}

	@Override
	public void resilier() {
		// TODO Auto-generated method stub
		System.out.println("Faire une resiliation");
	}
	
	
    
	

}
