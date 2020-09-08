package com.esmt.formation.java;

import java.util.Comparator;

public class ComparateurSelonLeNom implements Comparator<Personne> {

		@Override
		public int compare(Personne arg0, Personne arg1) {
			// TODO Auto-generated method stub
			return  arg0.getNom().compareTo(arg1.getNom());
		}


	}
