package com.esmt.formation.java;

import java.math.BigInteger;

public class Rationnel implements Comparable <Rationnel> {
	private int numerateur;
	private int denominateur = 1;
	
	/**
	 * @param numerateur
	 * @param denominateur
	 */
	public Rationnel(int numerateur, int denominateur) {
		this.numerateur = numerateur;
		this.setDenominateur(denominateur);
	}

	public int getNumerateur() {
		return numerateur;
	}
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}
	public int getDenominateur() {
		return denominateur;
	}
	public void setDenominateur(int denominateur) {
		if (denominateur != 0) this.denominateur = denominateur;
	}
	
	public void reduire () {
		BigInteger pgcd  = (BigInteger.valueOf(denominateur)).gcd(BigInteger.valueOf(numerateur)); 		
		numerateur /= pgcd.intValue();
		denominateur /= pgcd.intValue();
	}
		
	@Override
	public String toString() {
		reduire();
		return numerateur + "/" + denominateur ;
	}

	public void print () {
		System.out.print(this + " ");
	}

	@Override
	public int compareTo(Rationnel arg0) {
		if (this.numerateur * arg0.denominateur > arg0.numerateur * this.denominateur) return 1;
		else if (this.numerateur * arg0.denominateur < arg0.numerateur * this.denominateur) return -1;
		else return 0;
	}
}
