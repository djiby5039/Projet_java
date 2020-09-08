package com.cmapp.entities;

import java.io.Serializable;

public class Contact implements Serializable, Comparable<Contact>{
	private static final long serialVersionUID = -870400056721643338L;
	
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private int id;
	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param email
	 */
	public Contact(String nom, String prenom, String telephone, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
	}
	/**
	 * @param id
	 */
	public Contact(int id) {
		this.id = id;
	}
	

	/**
	 * @param nom
	 */
	public Contact(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int compareTo(Contact contact) {
		Integer id0=id;
		Integer id1=contact.getId();
		return id0.compareTo(id1);
	}
	
	
	
}
