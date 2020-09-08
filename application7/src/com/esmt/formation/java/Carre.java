package com.esmt.formation.java;

public class  Carre  extends Figure {
	
	int cote;
  
	 /**
	 * @param cote
	 */
	public Carre(int cote) {
		this.cote = cote;
	}

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {
		this.cote = cote;
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println(this);
		
	}

	@Override
	public float getSurface() {
		// TODO Auto-generated method stub
		return cote*cote;
	}

	@Override
	public String toString() {
		return "Carre [cote=" + cote + "]";
	}
	
	
}
