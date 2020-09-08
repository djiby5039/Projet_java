package com.esmt.formation.java;

public class Rationnel implements Comparable<Rationnel> {

	/**
	 * 
	 */
	   private int numerateur ;
	   private int denominateur;
	
	public int getNumerateur() {
		return numerateur;
	}
	public int getDenominateur() {
		return denominateur;
	}
	
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}
	public void setDenominateur(int denominateur) {
		if(denominateur == 0) {
			this.denominateur = 1;
		}
		else {this.denominateur=denominateur;}
		
	}
	public Rationnel(int numerateur , int denominateur) {
		super();
		// TODO Auto-generated constructor stub
		this.numerateur = numerateur;
		this.denominateur = denominateur;
		}
	
	public Rationnel() {
		super();
		this.numerateur=0;
		this.denominateur=1;
		}
	
	
	public  void affiche() {
		System.out.println("Le numerateur de votre fraction est:"+numerateur);
		System.out.println("Le denominateur de votre fraction est:"+denominateur);
		System.out.println(toString());
         		
		}
	private int pgcd() {
		     while(numerateur != denominateur) {
	if(numerateur > denominateur) {numerateur = numerateur - denominateur;}
	else {if(numerateur < denominateur) {denominateur=denominateur - numerateur;}}
		     }
		     
	           if(denominateur != 0) {return numerateur; }
			return denominateur;}
	  private void irreductible() {int pgcd =pgcd();
	   numerateur/=pgcd;
	   denominateur/=pgcd;}
	  
	  
	  @Override
	public String toString() {
		irreductible();
		return format();
		
	}
	private String format() {return numerateur+"/"+denominateur;}
	
	public static Rationnel soustaction(Rationnel rationnel1 , Rationnel rationnel2) {
		return new Rationnel(rationnel1.numerateur*rationnel2.denominateur - rationnel2.numerateur*rationnel1.denominateur
				,rationnel1.denominateur*rationnel2.numerateur);
		
		}
	
		
	
	         //
	@Override
	public int compareTo(Rationnel arg0) {
		// TODO Auto-generated method stub
		if(this.numerateur*arg0.denominateur>this.denominateur*arg0.numerateur)return 1;
		else if(this.numerateur*arg0.denominateur<this.denominateur*arg0.numerateur)return -1;
		else return 0;
		
		
		
	}
	}
