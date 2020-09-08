package com.esmt.formation.java;

public class Rectangle extends Figure {
   	 
   	 float longueur ;
   	 float largeur;
   	 
   	 
   	 
   	 
	/**
	 * @param surface
	 * @param perimetre
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle( float longueur, float largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	public float getLongueur() {
		return longueur;
	}
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	public float getLargeur() {
		return largeur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}
	@Override
	public float getSurface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}
	
	
 }
