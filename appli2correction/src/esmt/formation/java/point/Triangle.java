package esmt.formation.java.point;

public class Triangle {
	
	
	// les attributs d'instances
	private Point sommet1;
	private Point sommet2;
	private Point sommet3;
	/**
	 * @param sommet1
	 * @param sommet2
	 * @param sommet3
	 */
	public Triangle(Point sommet1, Point sommet2, Point sommet3) {
		this.sommet1 = sommet1;
		this.sommet2 = sommet2;
		this.sommet3 = sommet3;
	}
	/**
	 * @param sommet2
	 * @param sommet3
	 */
	public Triangle(Point sommet2, Point sommet3) {
		this(new Point(),sommet2 ,sommet3);
		this.sommet3 = sommet3;
	}
	
	public void affiche() {System.out.println(this);}
	@Override
	public String toString() {
		return "Triangle [\n\tsommet1=" + sommet1 + ", \n\tsommet2=" + sommet2 + ", \n\tsommet3=" + sommet3 + "]";
	}
	 
	public boolean isEquilateral() {double d12=Point.calculerDistance(sommet1 , sommet2);
	                                double d23=Point.calculerDistance(sommet1 , sommet2);
	                                double d31=Point.calculerDistance(sommet1 , sommet2);
	if(d12 == d23 && d23 == d31) {return true;
			}else {return false;}
	}
	
	

}



