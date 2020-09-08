package com.esmt.formation.java;

import java.util.Scanner;

/**
 * @author Djiby sow
 *
 */
public class DemoPolymorphisme {
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boisson[] casier = new Boisson[10] ;
		 
		for(int i=0 ; i<casier.length; i++) {
			
			if(i<3) {
				casier[i] =new Boisson("boisson "+(i + 1));
				
				
			}
			else {
				casier[i] = new BoissonAlcolisee("Boisson al"+(i + 1) , i);
				}}}
        
	
	public  void payer(Boisson b) {
    	    System.out.println("le prix de la boisson:"+b.getNom()+"est"+b.getPrix());
	}
	
	
	
}
