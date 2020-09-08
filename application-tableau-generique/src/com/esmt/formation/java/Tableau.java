package com.esmt.formation.java;

import java.util.Arrays;

public class Tableau <T> {
	
	private T values [];
	
	public Tableau (T values []) {
		this.values = values;
	}
	
	public void tri () {
		Arrays.sort(values);
	}
	
	public void affiche () {
		for (T value : values) {
			System.out.println("->> " + value);
		}
	}
}