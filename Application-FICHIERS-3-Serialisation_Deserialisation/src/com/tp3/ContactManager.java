package com.tp3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ContactManager {
	private static ArrayList<Contact> contacts= new ArrayList<Contact>();
	
	public static void addContact (Contact contact){
		ObjectOutputStream oos = null;
		try (FileOutputStream fos = new FileOutputStream("contacts.ser",true)){
			oos = new ObjectOutputStream(fos);
			oos.writeObject(contact);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void serialiseContacts (String contactFileName) {
		Iterator<Contact> it=  contacts.iterator();
		while(it.hasNext()) {
			ContactManager.addContact(it.next());
		}
	}
	
	public static Contacts deserialiseContacts (String contactFileName) {
		ObjectInputStream ois = null;
		ArrayList<Contact> liste= new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(contactFileName)){
			ois= new ObjectInputStream(fis);
			liste=(ArrayList<Contact>) ois.readObject();
				
				
				System.out.println(liste);
			
			
		} catch (IOException e) {
			e.printStackTrace();		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Contacts(liste);
	}
	
	public static <T> Contact searchContact (T critere) throws ContactManagerException {
		Iterator<Contact> it= contacts.iterator();
		boolean found=false;
		Contact contact = null;
		while(it.hasNext() && !found) {
			if((critere instanceof String)) {
				if(it.next().getNom()==critere) {
					found=true;
					contact= new Contact(it.next().getId(), it.next().getNom(), it.next().getPrenom(), it.next().getNumTel(), it.next().getEmail());
				}else {
					throw new ContactManagerException("Non trouvé!");
				}
			}else if((critere instanceof Integer)) {
				if(it.next().getId()==critere) {
					found=true;
					contact= new Contact(it.next().getId(), it.next().getNom(), it.next().getPrenom(), it.next().getNumTel(), it.next().getEmail());
				}else {
					throw new ContactManagerException("Non trouvé!");
				}
			}else {
				throw new ContactManagerException("Mauvais critère");
			}
		}
		return contact;
	}
	
	public static void updateContact (Contact contact) {
		
	}
	
	public static void deleteContact (int identifiant) {
		
	}
	
}
