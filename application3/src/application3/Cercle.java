package application3;


public class Cercle {

	/**
	 * 
	 */
	private  double rayon ;
	private  float centre ;
	
	
	
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public float getCentre() {
		return centre;
	}
	public void setCentre(float centre) {
		this.centre = centre;
	}
	public Cercle(float centre , double rayon) {
		super();
		// TODO Auto-generated constructor stub
		this.centre = centre;
		this.rayon = rayon;
		}
	public  void affiche() {
		System.out.println("Le centre du cercle est:"+centre);
		System.out.println("Le rayon du cercle est:"+rayon);
		
		
	    }
	public  void surface() {
		System.out.println("La surface du cercle est:"+Math.PI*Math.pow(rayon, 2));
		}
	public  void perimetre() {
		System.out.println("Le perimetre du cercle est:"+2*Math.PI*rayon);
		}
	
 }
