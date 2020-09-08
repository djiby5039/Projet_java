package com.esmt.formation.java;

public class EntierNaturel {
	
	private Integer values;
	

	/**
	 * @param values
	 * @throws ConstuctorException 
	 */
	public EntierNaturel(int values) throws ConstuctorException {
		if(values < 0)
		throw new ConstuctorException("Attention pas d'entier avec une valeur negatif!!");
		else
		this.values = values;
		
	}

	public Integer getValues() {
		return values;
	}

	public void setValues(int values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "EntierNaturel [values=" + values + "]";
	}
	
	public void affiche() {
		System.out.println(this);
	}

	
public static EntierNaturel somme (EntierNaturel n1 , EntierNaturel n2) throws ConstuctorException, SommeException {
		
		Long value = n1.getValues().longValue() + n2.getValues().longValue();
		if( value > Integer.MAX_VALUE) {throw new SommeException("l'entier n'est pas representatif");}
		return new EntierNaturel(n1.getValues() + n2.getValues());
		
	}
 
	
}
