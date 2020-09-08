package com.esmt.formation.java;

import java.util.Comparator;

public class ComparateurSelonAge implements Comparator<Personne> {
	@Override
	public int compare(Personne arg0, Personne arg1) {
		return Integer.compare(arg0.getAge(), arg1.getAge());
	}
}