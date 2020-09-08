import java.util.Arrays;

import application.Clavier;

public class Application {

	public static void main(String[] args) {
		//  
		double [] serieDeReels =new double [10];
		
		    for (int i =0 ; i < serieDeReels.length ; i++) {
		    	
		    	System.out.println("Entrez le reel "+ (i + 1));
		    	serieDeReels [i] = Clavier.lireDouble();
		    	
		    }
		 // Tri du tableau dans l'ordre croissant
	    	System.out.println("contenu du tableau avant le tri");
	    	affiche(serieDeReels);
	    	
	    	Arrays.sort(serieDeReels);
	    	
	    	System.out.println("contenu du tableau apres le tri");
	    	affiche(serieDeReels);
		    
		    
		    System.out.println("Entrez le reel rechercher SVP");
		    double reelARechercher = Clavier.lireDouble();
		    int position = Arrays.binarySearch(serieDeReels, reelARechercher);
		    if(position <0) {
		    	System.out.println(reelARechercher + "n'est pas dans le tableau");
		    }else {System.out.println(reelARechercher+ "se trouve a la position" + position);}
	}
		     public static void  affiche (double [] reels) {
		    	 for (int i =0 ; i < reels.length ; i++){
		    		 System.out.println(reels [i] + " ");
		    	 }
		     }

	}
