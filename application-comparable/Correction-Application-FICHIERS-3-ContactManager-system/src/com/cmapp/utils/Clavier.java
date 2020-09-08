package com.cmapp.utils;

import java.util.Scanner;

/**
 * 
 * @author Ndiaga THIONGANE
 * @since 29.10.2019 12:00
 */

public class Clavier {
	
	//L'unique attribut de l'objet
	private static Scanner scanner=null;
	
	/**
	 * Ouvre le flux d'entrée
	 */
	private static void init() {
		scanner = new Scanner(System.in);
	}
	/**
	 * Ferme le flux d'entrée
	 */
	public static void close() {
		if(scanner!=null) {
			scanner.close();
		}
	}
	
	//Les méthodes
	
	/**
	 *Cette fonction lit une chaine de caractere au clavier 
	 * @return
	 */
	public static String lireString() {
		init();
		String chaineLue=scanner.nextLine();
		return chaineLue;
	}
	
	/**
	 *Cette fonction lit un int au clavier 
	 * @return
	 */
	public static int lireInt() {
		String chaineLue=lireString();
		return Integer.parseInt(chaineLue);
	}
	
	/**
	 *Cette fonction lit un float au clavier 
	 * @return
	 */
	public static float lireFloat() {
		String chaineLue=lireString();
		return Float.parseFloat(chaineLue);
	}
	
	/**
	 *Cette fonction lit un double au clavier 
	 * @return
	 */
	public static double lireDouble() {
		String chaineLue=lireString();
		return Double.parseDouble(chaineLue);
	}
	
	/**
	 *Cette fonction lit un booleen au clavier 
	 * @return
	 */
	public static boolean lireBoolean() {
		String chaineLue=lireString();
		return Boolean.parseBoolean(chaineLue);
	}
	
	/**
	 * Cette fonction lit un caractere au clavier
	 * @return
	 */
	public static char lireChar() {
		String chaineLue=lireString();
		return chaineLue.charAt(0);
	}
	
	
}

