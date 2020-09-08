package com.esmt.formation.java.objects;

import com.esmt.formation.java.exceptions.ConstructorException;
import com.esmt.formation.java.exceptions.DifferenceException;
import com.esmt.formation.java.exceptions.ProduitException;
import com.esmt.formation.java.exceptions.SommeException;

public class EntierNaturel {
	private Integer value;

	/**
	 * @param value
	 * @throws ConstructorException 
	 */
	public EntierNaturel(Integer value) throws ConstructorException {
		if (value < 0) throw new ConstructorException("Impossible de créer l'entier naturel", value);
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	/**
	 * @param n1
	 * @param n2
	 * @return
	 * @throws SommeException
	 * @throws ConstructorException
	 */
	public static EntierNaturel somme (EntierNaturel n1, EntierNaturel n2) throws SommeException, ConstructorException {
		Long value = n1.value.longValue() + n2.value.longValue();
		if (value > Integer.MAX_VALUE) {
			throw new SommeException("Le résultat de la somme n'est pas représentatif d'un entier naturel.");
		}
		return new EntierNaturel(n1.value + n2.value);
	}
	
	/**
	 * @param n1
	 * @param n2
	 * @return
	 * @throws DifferenceException
	 * @throws ConstructorException
	 */
	public static EntierNaturel difference (EntierNaturel n1, EntierNaturel n2) throws DifferenceException, ConstructorException {				
		if (n1.value - n2.value < 0) {
			throw new DifferenceException("Le résultat de la différence n'est pas représentatif d'un entier naturel.");
		}
		return new EntierNaturel(n1.value - n2.value);
	}
	
	/**
	 * @param n1
	 * @param n2
	 * @return
	 * @throws ProduitException
	 * @throws ConstructorException
	 */
	public static EntierNaturel produit (EntierNaturel n1, EntierNaturel n2) throws ProduitException, ConstructorException {
		Long value = n1.value.longValue() * n2.value.longValue();
		if (value > Integer.MAX_VALUE) {
			throw new ProduitException("Le résultat du produit n'est pas représentatif d'un entier naturel.");
		}
		return new EntierNaturel(n1.value * n2.value);
	}
}