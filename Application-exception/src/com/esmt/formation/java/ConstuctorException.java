package com.esmt.formation.java;



public class ConstuctorException extends Exception {
	private Integer values;
        
	public ConstuctorException() {}
 
	public ConstuctorException(String message) { super(message);}
	
	public ConstuctorException(String message , int values) { super(message); this.values=values;}
	
	
	public Integer getValues() {return values;}

}





