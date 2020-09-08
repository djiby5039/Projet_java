	package com.esmt.formation.java.contact.manager;
	
	import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.esmt.formation.java.contact.Contact;
	
	 /**
	 * @author Djiby sow
	 *
	 */
	public class ContactManager {
		
	           /**
	         * 
	         */
	        public static void addContact() {
	        	   
	        	   Scanner sc = new Scanner(System.in);
	        	   System.out.println("Donner le nom");
	        	   String nom = sc.nextLine();
	        	   String prenom = sc.nextLine();
	        	   String telephone = sc.nextLine();
	        	   String adresse = sc.nextLine();
	        	   int identifiant = sc.nextInt();
	        	   
	        	   }
		  
		     public static void SerialiseContacts()  {
		    	 List<Contact> liste = new ArrayList();
		    	 
		    	 try(FileOutputStream fos = new FileOutputStream("Contact");
		    		ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		    		 
		    		 oos.writeObject(liste);
		    		 
		    	 } catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("ERREUR DE TYPE"+e.getMessage());
				}
			  
		  }
		    public static <T>  Contact searchContact() {
				return null;
			   
		   }
		    
		   /**
		 * @return
		 */
		public static Contacts deserialiseContacts() {
			  
			   
		   }
	    public static void updateContact() {
	    	
	    	
	    }
	    
	    public static void deleteContact() {}
	}
