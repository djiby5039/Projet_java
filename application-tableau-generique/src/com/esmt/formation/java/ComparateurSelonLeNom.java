package com.esmt.formation.java;

import java.util.Comparator;

public class ComparateurSelonLeNom implements Comparator<Personne> {
	@Override
	public int compare(Personne arg0, Personne arg1) {
		return arg0.getNom().compareTo(arg1.getNom());
	}
}
