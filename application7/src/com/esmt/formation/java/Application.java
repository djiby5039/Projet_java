package com.esmt.formation.java;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application figure = new Application();
		figure.execute();
		
	}
		
		public static void afficherLaPlusGrande (Figure figure_1 , Figure figure_2) {
			System.out.println("entre"+figure_1);
			System.out.println("et"+figure_2);
			
			if(figure_1.getSurface() > figure_2.getSurface()) {figure_1.affiche();}
			else {figure_2.affiche();}
			
			System.out.println("\test la figure la plus grande");
			
			}
		 

	
	  public void execute() {
	 	
		Figure cercle = new Cercle(2);
		Figure carre = new Carre(10);
		
		Figure triangle = new Triangle(4 , 3);
		Figure rectangle = new Rectangle(5,9);
				
		Application.afficherLaPlusGrande(cercle , carre);
		Application.afficherLaPlusGrande( triangle , carre);
		Application.afficherLaPlusGrande(triangle , rectangle);
		
	}

}
