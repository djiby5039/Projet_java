package com.esmt.formation.java;

public class ObjectComparator<T extends Comparable<? super T>>  {

	
	  private T objet1;
	  private T objet2;
	/**
	 * @param objet1
	 * @param objet2
	 */
	public ObjectComparator(T objet1, T objet2) {
		this.objet1 = objet1;
		this.objet2 = objet2;
	}
	  
	  
	  public T getMin() {
		  
		int resultat=  objet1.compareTo(objet2);
		
		if(resultat<0) return objet1;
		else return objet2;
		else throw new  EqualObjetException();
	  }
	  
     public T getMax() {
		  
    	 int resultat=  objet1.compareTo(objet2);
 		
 		if(resultat>0) return objet1;
 		else return objet2;
	  }


	public T getObjet1() {
		return objet1;
	}


	public void setObjet1(T objet1) {
		this.objet1 = objet1;
	}


	public T getObjet2() {
		return objet2;
	}


	public void setObjet2(T objet2) {
		this.objet2 = objet2;
	}
     
     
}
