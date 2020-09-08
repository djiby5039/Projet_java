package com.esmtl32019.junit.test;

import java.util.Stack;

public class PileListeChainee<E> extends Stack<E> {
	private Noeud sommet;
	
	private class Noeud {
		public E elt;
		public Noeud successseur;
		
		public Noeud (E x, Noeud s) {
			elt= x; successseur= s;
		}
	}
	
	public PileListeChainee() {
		sommet =null;
	}
	
	public boolean estVide() {
		return sommet ==null;
	}
	/**
	 * retourne l'element ajouter en dernier 
	 * @return
	 */
	public E peek() {
		if(estVide() ) throw new IllegalArgumentException("La pile est vide");
		return sommet.elt;
	}
	/**
	 * Ajoute un element a la pile 
	 * @param element
	 */
	public void push (E element) {
		
		sommet = new Noeud(element, sommet);
	}
	
	public void Vider() {
		sommet = null;
	}
	/**
	 * Retire un element a la pile
	 * @return
	 */
   public E pop() {
	   if(estVide() ) throw new IllegalArgumentException("La pile est vide");
	   E eltSommet = sommet.elt;
	   sommet = sommet.successseur;
	   return eltSommet;
   }
}