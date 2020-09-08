package application2;
import java.lang.Math;

public class Triangle {
    /**
	 * 
	 */
	public static int a ;
	public static int b;
	public static int c;
	
	
	
	
	public Triangle(int a , int b , int c) {
		super();
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b; 
		this.c = c;
		
	}
	/**
	 * @param a
	 * @param b
	 */
	public Triangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void affiche() {
		System.out.println("Le points a est"+a);
		System.out.println("Le points b est"+b);
		System.out.println("Le points c est"+c);
	 
	}
	public static boolean isEquilateral() {
		if(Math.abs(b-a) == Math.abs(b-c) &&  Math.abs(c - a) == Math.abs(b-a)) {
			    return true;
			    
		}
		else {
			return false;
		}
}}