package com.esmt.formation;

public class Personne {
	       
	private String nom;
	private String prenom;
	private char genre;
	private int age;
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param genre
	 * @param age
	 */
	public Personne(String nom, String prenom, char genre, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.age = age;
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
	public char getGenre() {
		return genre;
	}
	public void setGenre(char genre) {
		this.genre = genre;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", age=" + age + "]";
	}
	
	public void peutSePresenter() {System.out.println(this);}
	
	class Adresse extends Personne{
		int numeroRue;
		String nomRue;
		/**
		 * @param nom
		 * @param prenom
		 * @param genre
		 * @param age
		 * @param numeroRue
		 * @param nomRue
		 * @param numeroRue 
		 */
		public Adresse( String nomRue, int numeroRue) {
			super(nom, prenom, genre, age);
			this.numeroRue = numeroRue;
			this.nomRue = nomRue;
			
			
		}
		@Override
		public void peutSePresenter() {
			// TODO Auto-generated method stub
			super.peutSePresenter();
		}
		
		
	}
}

