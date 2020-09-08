package com.esmt.formation.java;

/**
 * @author Djiby sow
 *
 */
public class Etudiant {
	//Attributs d'instance
	private String prenom;
	private int code;
	
	
	public Etudiant() {
		// TODO Auto-generated constructor stub
		this("");
	}
	
		/**
	 * @param prenom
	 */
	public Etudiant(String prenom) {
		this(prenom ,0);
	}


	/**
	 * @param prenom
	 * @param code
	 */
	public Etudiant(String prenom, int code) {
		super();
		this.prenom = prenom;
		this.code = code;
	}
	     
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public void presenteToi () {
		System.out.println("je m'appele "+prenom+" et mon code est :"+code);
	}
	

}
