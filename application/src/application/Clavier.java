package application;

import java.util.Scanner;

/**
 * 
 * @author Ghislain Akinocho
 * @since 29.10.2019 12:00
 * @
 */
public class Clavier {
	
	// L'unique attribut de l'objet
	private static Scanner scanner = null;
	
	public  Clavier() {}
	
	public static void init () {
		scanner = new Scanner (System.in);
	}
	/**
	 * Cette fonction lit une chaine de caractère au clavier
	 * @return
	 */
	public static String lireString () {
		init (); 
		String chaineLue = scanner.nextLine();
		return chaineLue;
	}
	/**
	 * Cette fonction lit un int au clavier
	 * @return
	 */
	public static int lireInt () {
		String chaineLue = lireString();
		return Integer.parseInt(chaineLue);
	}
	/**
	 * Cette fonction lit un float au clavier
	 * @return
	 */
	public static float lireFloat () {
		String chaineLue = lireString();
		return Float.parseFloat(chaineLue);
	}
	/**
	 * Cette fonction lit un double au clavier
	 * @return
	 */
	public static double lireDouble () {
		String chaineLue = lireString();
		return Double.parseDouble(chaineLue);
	}
	/**
	 * Cette fonction lit un boolean au clavier
	 * @return
	 **/
	public static boolean lireBoolean () {
		String chaineLue = lireString();
		return Boolean.parseBoolean(chaineLue);
	}
	/**
	 * Cette fonction lit un caractère au clavier
	 * @return
	 */
	public static char lireChar () {
		String chaineLue = lireString();
		if(chaineLue.length() > 0){
		
		return chaineLue.charAt(0);
	}
		else{
			return 'x';}
		}
	
	public static void close ( ) {
		if (scanner != null) {
			scanner.close () ;
		}
	}
}
