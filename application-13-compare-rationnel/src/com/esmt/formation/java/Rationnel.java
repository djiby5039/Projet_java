/*
 * seteur divsion 0
 * mettre la rdduction au meme deno dans une fonction
 * instancier referencement
 */
package com.esmt.formation.java;


public class Rationnel implements Comparable<Rationnel> {
	private int numerateur;
	private int denominateur;
	
	/**
	 * constructeur par defaut dun nombre rationnel
	 */
	public Rationnel() {
		this.numerateur = 0;
		this.denominateur = 1;
	}
	
	/**
	 * @param numerateur
	 * @param denominateur
	 * contructeur par parametre
	 */
	public Rationnel(int numerateur, int denominateur) {
		this.numerateur = numerateur;
		setDenominateur(denominateur);
		
		
	}

	/**
	 * @return the numerateur
	 */
	public int getNumerateur() {
		return numerateur;
	}

	/**
	 * @param numerateur the numerateur to set
	 */
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
		
	}

	/**
	 * @return the denominateur
	 */
	public int getDenominateur() {
		return denominateur;
	}

	/**
	 * @param denominateur the denominateur to set
	 */
	public void setDenominateur(int denominateur) {
		if (denominateur ==0)
			throw new IllegalArgumentException(" On peut pas diviser par 0 ");
		else
		this.denominateur = denominateur;
		
	}
	/**
	 * @param a
	 * @param b
	 * @return int
	 * clacule le pgdc entre deux nombre a et b
	 */
	private int pgcd(int a, int b) {
	   int r=0;	    
	    for(;;) {
	        r=a%b;
	        //int q = (a-r)/b;
	        if (r==0) break;
	        a=b;
	        b=r;
	    }
	    return b;
	}
	 /**
	 * affiche le nombre rationnel
	 */
	public void afficher()
	 {
		if (this.numerateur==0)
		{
			System.out.print(+numerateur+"/"+denominateur+" => ");
			System.out.println(0);
		}
		else
			if(numerateur==denominateur)
			{
				System.out.print(+numerateur+"/"+denominateur+" => ");
				System.out.println(1);
			}
			else 
				if (denominateur==-1)
				{
					System.out.print(numerateur+"/"+denominateur+" => ");
					System.out.println(-1*numerateur);
				}
				else 
					if (denominateur<0 && numerateur !=0 )
					{
						System.out.print(numerateur+"/"+denominateur+" => ");
						numerateur=-1*numerateur;
						System.out.println(numerateur/pgcd(numerateur, denominateur)+"/"+denominateur/pgcd(numerateur, denominateur));
					}
			
			else
				{
					System.out.print(numerateur+"/"+denominateur+" => ");
					System.out.println(numerateur/pgcd(numerateur, denominateur)+"/"+denominateur/pgcd(numerateur, denominateur));
				}
	 }
	
	public static Rationnel[] reduireMemeDeno(Rationnel a, Rationnel b) {
		Rationnel[] res= {new Rationnel(), new Rationnel()};
		a.numerateur*=b.denominateur;
		b.numerateur*=a.denominateur;
		
		a.denominateur=b.denominateur=a.denominateur*b.denominateur;
		res[0]=a;
		res[1]=b;
		return res;
	}
	/**
	 * @param a
	 * @param b
	 * @return Rationnel
	 * permet laddition de deux nombre rationnel
	 */
	public static Rationnel addition(Rationnel a, Rationnel b) {
		Rationnel res =new Rationnel();
		Rationnel[] resTemp= {new Rationnel(), new Rationnel()};
		if (a.denominateur!=b.denominateur)
		{
			resTemp = reduireMemeDeno(a, b);
			for (int i=0; i<resTemp.length;i++)
			{
				res.numerateur+= resTemp[i].numerateur;
				res.denominateur= resTemp[i].denominateur;
			}
		}
		else
		{
			res.numerateur= a.numerateur+b.numerateur;
			res.denominateur= a.denominateur;
		}
			
		return res;
	}	

	/**
	 * @param a
	 * @param b
	 * @return Rationnel
	 * permet la soustraction de deux nombre rationnel
	 */
	public static Rationnel soustraction(Rationnel a, Rationnel b) {
		Rationnel res =new Rationnel();
		Rationnel[] resTemp= {new Rationnel(), new Rationnel()};
		if (a.denominateur!=b.denominateur)
		{
			resTemp = reduireMemeDeno(a, b);
			for (int i=0; i<resTemp.length;i++)
			{
				res.numerateur-= resTemp[i].numerateur;
				res.denominateur= resTemp[i].denominateur;
			}
		}
		else
		{
			res.numerateur= a.numerateur-b.numerateur;
			res.denominateur= a.denominateur;
		}
			
		return res;
	}	
	/**
	 * @param a
	 * @param b
	 * @return Rationnel
	 * permet la multiplication de deux nombre rationnel
	 */
	public static Rationnel multiplication(Rationnel a, Rationnel b) {
		Rationnel res =new Rationnel();
		res.numerateur= a.numerateur*b.numerateur;
		res.denominateur= a.denominateur * b.denominateur;
		return res;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return Rationnel
	 * permet la division de deux nombre rationnel
	 */
	public static Rationnel division(Rationnel a, Rationnel b) {
		Rationnel res =new Rationnel();
		res.numerateur= a.numerateur*b.denominateur;
		res.denominateur= a.denominateur * b.numerateur;
		return res;
	}

	@Override
	public int compareTo(Rationnel o) {
		
		if (this.numerateur*o.denominateur > o.numerateur*this.denominateur)
			return 1;
		else
			if (this.numerateur*o.denominateur < o.numerateur*this.denominateur)
				return -1;
			else
				return 0;
	}

}