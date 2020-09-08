package com.esmt.formation.java;

public class BoissonAlcolisee extends Boisson {
	private int degreAlcool ;
	
	public BoissonAlcolisee(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
		this.nom=nom;
	}
     
	/**
	 * @param nom
	 */
	public BoissonAlcolisee(String nom, int degreAlcool) {
		super(nom);
		// TODO Auto-generated constructor stub
		this.nom= nom;
		this.degreAlcool=degreAlcool;
	}

	public int getDegreAlcool() {
		return degreAlcool;
	}

	public void setDegreAlcool(int degreAlcool) {
		this.degreAlcool = degreAlcool;
		
	}
	
		
}
