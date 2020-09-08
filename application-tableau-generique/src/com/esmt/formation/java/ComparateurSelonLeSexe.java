package com.esmt.formation.java;

import java.util.Comparator;

public class ComparateurSelonLeSexe implements Comparator<Personne> {
	@Override
	public int compare(Personne arg0, Personne arg1) {
		return Character.compare(arg0.getSexe(), arg1.getSexe());
	}	
}