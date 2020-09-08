package com.esmt.formation.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Tableau <T extends Comparable<? super T>> {	
	private List<T> values;
	
	public Tableau (List<T> values) {
		this.values = values;
	}
	
	public Tableau() {
		values = new ArrayList<> ();
	}
	
	public void tri () {
		Collections.sort(values);
	}

	public void tri (Comparator<? super T> comparator) {
		Collections.sort(values, comparator);
	}
	
	public void affiche () {
		Iterator<T> it = values.iterator();
		while (it.hasNext()) {
			System.out.println("->> " + it.next());
		}
	}
	
	public void add (T value) {
		values.add(value);
	}
}