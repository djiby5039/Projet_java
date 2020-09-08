package com.esmt.formation.java.run;

import com.esmt.formation.etudiant.EtudiantSalairie;
import com.esmt.formation.salaire.ISalarie;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void execute() {
		
		ISalarie etudiantSalarie =new EtudiantSalairie("bousso", "mame", (char) 50, 2, 8, 5); 
		        etudiantSalarie.augmentationSal();
		        etudiantSalarie.poserDemission();
		        etudiantSalarie.getsalaire();
	}
	
	public double quelEstSonSalaire(ISalarie salarie) { return salarie.getsalaire();}

}
