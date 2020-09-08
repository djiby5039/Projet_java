package com.esmt.formation.java;

public class EntierNaturelRun {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		EntierNaturelRun app = new EntierNaturelRun();
		
		
		
		
		
	
		try {
			EntierNaturel value = new EntierNaturel(-8);
			
			System.out.println("La valeur du naturel est\n"+value.getValues());
		} catch (ConstuctorException e) {
			   
			System.out.println(e.getMessage()+"AVEC LA VALEUR\n"+e.getValues());
			       
		}
		System.out.println("Le programme continue");
		

		
	}
	
	}
