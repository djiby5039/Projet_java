package com.esmt.formation.java;

import java.util.Comparator;

public class ComparaisonSelonLage implements Comparator<Personne> {

	@Override
	public int compare(Personne arg0, Personne arg1) {
		
		
	 if(arg0.getAge()>arg1.getAge())  return 1;
	 else if(arg0.getAge()<arg1.getAge()) return -1;
	 else return 0;
	}

}
