package com.esmt.formation.salaire;

import com.esmt.formation.Personne;

public class Salarie  extends Personne implements ISalarie{
	   
	 private int matricule;
	 private int  indperformance;
	 protected double salaire;
	 
	/**
	 * @param matricule
	 * @param indperformance
	 */
	
	
	public int getMatricule() {
		return matricule;
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param genre
	 * @param age
	 * @param matricule
	 * @param indperformance
	 */
	public Salarie(String nom, String prenom, char genre, int age, int matricule, int indperformance) {
		super(nom, prenom, genre, age);
		this.matricule = matricule;
		this.indperformance = indperformance;
	}
	

	public int getIndperformance() {
		return indperformance;
	}
	public void setIndperformance(int indperformance) {
		this.indperformance = indperformance;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	@Override
	public String toString() {
		return "Salarie [matricule=" + matricule + ", indperformance=" + indperformance + "]";
	}

	@Override
	public void poserDemission() {
		// TODO Auto-generated method stub
		System.out.println("je souhaiterais  demissionner");
		
	}

	@Override
	public void augmentationSal() {
		// TODO Auto-generated method stub
		System.out.println("je veux une augmentation de salaire");
		
	}
	@Override
	public double getsalaire() {
		return salaire;
		// TODO Auto-generated method stub
		
	}
	 
}