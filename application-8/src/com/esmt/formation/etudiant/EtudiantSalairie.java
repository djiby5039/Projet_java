package com.esmt.formation.etudiant;

import com.esmt.formation.salaire.Salarie;

public class EtudiantSalairie extends Salarie implements IEtudiant {


	 
	

	public EtudiantSalairie(String nom, String prenom, char genre, int age, int matricule, int indperformance) {
		super(nom, prenom, genre, age, matricule, indperformance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void passerExamen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inscrire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DemandeExoneration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getsalaire() {
		return super.getsalaire();
	}
	
	

}
