package com.esmt.formation.java;

public class Personne implements Cloneable {
	
	         private String nom;
	         private String prenom;
	         private int  age;
	        
	         /**
			 * @param nom
			 * @param prenom
			 * @param age
			 */
			public Personne(String nom, String prenom, int age) {
				this.nom = nom;
				this.prenom = prenom;
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
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				if(age>=0)
				this.age = age;
			}
			
			
	              
	     @Override
			public String toString() {
				return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
			}
		public void presenteToi() {System.out.println(super.toString()+ "\n" +this);}    
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}

}
