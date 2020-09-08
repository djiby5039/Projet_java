

public class Point {
	
	private char nom;
	private static double abcisse ;
	double ordonnee;
	public static int nbpoint ;
	
	/**
	 * @param nom
	 * @param abcisse
	 * @param ordonnee
	 */
	public Point(char nom, double abcisse, double ordonnee) {
		this.nom = nom;
		this.abcisse = abcisse;
		this.ordonnee = ordonnee;
		nbpoint++;
		}
	  
	/**
	 * @param nom
	 * @param abcisse
	 * @param ordonnee
	 */
	public Point() {
		this('O',0,0);
		
	}

	public char getNom() {
		return nom;
	}
	public void setNom(char nom) {
		this.nom = nom;
	}
	public double getAbcisse() {
		return abcisse;
	}
	public void setAbcisse(double abcisse) {
		this.abcisse = abcisse;
	}
	public double getOrdonnee() {
		return ordonnee;
	}
	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}
	public static int getNombre() {
		return getNombre();
	}

      public void affiche() {
              	
                      System.out.println(this.toString());
    }
	@Override
	public String toString() {
		return "Point [nom=" + nom + ", abcisse=" + abcisse + ", ordonnee=" + ordonnee + "]";
	}
	public void translate (double dx) {abcisse +=dx;}
	public void translate (double dx, double dy) {translate(dx);  ordonnee +=dy;} 
	public static double calculerDistance(Point a , Point b) {return Math.sqrt(Math.pow(Point.abcisse -Point.abcisse, 2) +Math.pow(a.ordonnee -b.ordonnee, 2) );}

}
