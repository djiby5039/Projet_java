package com.esmt.formation.java;

public class Cercle extends Figure {
	
	private float rayon ;
	
	

	/**
	 * @param rayon
	 */
	public Cercle(float rayon) {
		this.rayon = rayon;
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}
       
	
	
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

	@Override
	public float getSurface() {
		// TODO Auto-generated method stub
		return (float) (Math.pow(rayon, 2)*Math.PI);
	}

}
