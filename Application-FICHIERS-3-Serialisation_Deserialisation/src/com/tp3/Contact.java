package com.tp3;

import java.io.Serializable;

public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 181488779640461371L;
	private static Integer nbContacts;
	private Integer id;
	private String nom;
	private String prenom;
	private Integer numTel;
	private String email;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param numTel
	 * @param email
	 * @throws ContactManagerException 
	 */
	public Contact(Integer id,String nom, String prenom, Integer numTel, String email) throws ContactManagerException {
		this.nom = nom;
		this.prenom = prenom;
		setNumTel(numTel);
		this.email = email;
		setId(id);
	}
	/**
	 * @return the id
	 */
	public static Integer getNbContatcs() {
		return nbContacts;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 * @throws ContactManagerException 
	 */
	private void setId(Integer id) throws ContactManagerException {
		if(!(id instanceof Integer)) {
			throw new ContactManagerException("\nMauvais identifiant !\n");
		}
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @return the numTel
	 */
	public Integer getNumTel() {
		return numTel;
	}
	/**
	 * @param numTel the numTel to set
	 * @throws ContactManagerException 
	 */
	public void setNumTel(Integer numTel) throws ContactManagerException {
		if((numTel instanceof Integer)) {
			if(numTel>770000000 && numTel<780000000) {
				this.numTel = numTel;
			}else {
				throw new ContactManagerException("\nMauvais numero !\n");
			}
		}else {
			throw new ContactManagerException("\nMauvais numero !\n");
		}
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", numTel=" + numTel + ", email=" + email;
	}
	
}
