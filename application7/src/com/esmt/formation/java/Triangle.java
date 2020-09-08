package com.esmt.formation.java;

public class Triangle extends Figure {
	
	 private float base;
	 private float hauteur;
	 
	 
	 

	/**
	 * @param base
	 * @param hauteur
	 */
	public Triangle(float base, float hauteur) {
		this.base = base;
		this.hauteur = hauteur;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHauteur() {
		return hauteur;
	}

	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}
	
	

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", hauteur=" + hauteur + "]";
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

	@Override
	public float getSurface() {
		// TODO Auto-generated method stub
		return (base * hauteur)/2;
	}

}
