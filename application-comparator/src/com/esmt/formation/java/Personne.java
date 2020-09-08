package com.esmt.formation.java;

public class Personne implements Comparable<Personne>{
	
	private int identifiant;  
	private String nom;
	private char sexe;
	private int age;
	
	
	
	/**
	 * @param identifiant
	 * @param nom
	 * @param sexe
	 * @param age
	 */
	public Personne(int identifiant, String nom, char sexe, int age) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Personne arg0) {
		// TODO Auto-generated method stub

		return (new Integer (identifiant)).compareTo(new Integer(arg0.identifiant));
		//Integer id = Integer.parseInt(String.valueOf(identifiant));
		//Integer idArgd0 = Integer.ParseInt(String) 
		
	}
	@Override
	public String toString() {
		return "Personne [identifiant=" + identifiant + ", nom=" + nom + ", sexe=" + sexe + ", age=" + age + "]";
	}
	
	public void print() {
		System.out.println(this +" ");
	}
	

	

}
