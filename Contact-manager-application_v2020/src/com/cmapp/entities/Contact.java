package com.cmapp.entities;

import java.io.Serializable;

public class Contact implements Serializable, Comparable<Contact> {
	private static final long serialVersionUID = -870400056721643338L;

	private int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	
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
	
	public Contact() {
	
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

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Contact arg0) {
		return ((Integer)id).compareTo((Integer)arg0.id);
	}

	@Override
	public String toString() {
		return "\nContact [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email="
				+ email + "]";
	}
}
