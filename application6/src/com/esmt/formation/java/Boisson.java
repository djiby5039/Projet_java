package com.esmt.formation.java;

public class Boisson {
	 
	    public static double  Prix =  865.55;
	    protected String nom;
	    protected double prix;
	    
	    /**
		 * @param nom
		 * @param prix
		 */
		public Boisson(String nom) {
			this.nom = nom;
			
		}

		public String getNom() {
			return nom;
		}

	    public void setNom(String nom) {
			this.nom = nom;
		}

		
   public double getPrix() {
			return Prix;
		}
       
        public void setPrix(float prix) {
		}



		public void setPrix(double prix) {
			this.prix = prix;
		}
}

