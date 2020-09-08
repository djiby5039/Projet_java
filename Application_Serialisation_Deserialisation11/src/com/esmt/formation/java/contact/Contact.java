package com.esmt.formation.java.contact;

import java.io.Serializable;


public class Contact implements Serializable {
	    
	   /**
	 * 
	 */
	private static final long serialVersionUID = -7949046582988559767L;
	private String nom;
	   private String prenom;
	   private String  telephone;
	   private String email;
	   private int identifiant;
	   
	
	    
	   
	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param adresse
	 * @param identifiant
	 */
	public Contact(String nom, String prenom, String telephone,  int identifiant,String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.identifiant = identifiant;
		this.setEmail(email);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	  
	
	   
	   
	  
	    
}
