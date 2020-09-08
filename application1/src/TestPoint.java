import application.Clavier;
import esmt.formation.java.point.Point;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char nom ;
		double abs;
		double ord = 0 ;
		Point [] points = new Point [2];
		
		System.out.println("Entrez le nom du point :");
		nom = Clavier.lireChar();
		System.out.println("Entrez l abcisse du point :");
		abs = Clavier.lireDouble();
		System.out.println("Entrez l ordonne du point :");
 
		
		points[0] = new Point (nom , abs , ord);
		points[1] =new Point();
		
		points[0].affiche();
		points[1].affiche();
		
		points[0].translate(3);
		points[1].translate(-1 , -1);
		
		System.out.println("Nouvelles coordonnees apres translation");
		points[0].affiche();
		points[1].affiche();
		
		double distance = Point.calculerDistance(points[0], points[1]);
		System.out.println("la distance est " + +distance);
         // 		
		int nbInstancesDePoints = Point.getNombre(); 
		System.out.println("Nombre de points : " + nbInstancesDePoints);
		
		
		

	}

}
