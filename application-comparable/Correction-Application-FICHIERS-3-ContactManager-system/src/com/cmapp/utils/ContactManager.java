package com.cmapp.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cmapp.entities.Contact;
import com.cmapp.entities.Contacts;
import com.cmapp.exceptions.ContactManagerException;

public class ContactManager {
	private static String fileName="contacts.ser";
	public static String getFileName() {
		return fileName;
	}

	public static void setFileName(String fileName) {
		ContactManager.fileName = fileName;
	}

	/**
	 * Rend la classe ContactManager non instanciable
	 */
	private ContactManager() {}
	
	/**
	 * @param contact
	 * @throws ContactManagerException 
	 */
	public static void addContact (Contact contact) throws ContactManagerException {
		//désérialise
		Contacts contacts= deserialiseContacts();
		//ajoute
		contacts.add(contact);
		//sérialise
		serialiseContacts(contacts);
	}
	/**
	 * @param contacts
	 * @param contactFileName
	 * @throws ContactManagerException 
	 */
	public static void serialiseContacts (Contacts contacts,String contactFileName) throws ContactManagerException {
		try (FileOutputStream fos= new FileOutputStream(contactFileName); 
				ObjectOutputStream oos= new ObjectOutputStream(fos)){
			oos.writeObject(contacts);
		} catch (IOException e) {
			throw new ContactManagerException(e.getMessage());
		}
	}
	/**
	 * @param contacts
	 * @throws ContactManagerException
	 */
	public static void serialiseContacts (Contacts contacts) throws ContactManagerException {
		serialiseContacts(contacts, getFileName());
	}
	/**
	 * @param contactFileName
	 * @return
	 * @throws ContactManagerException 
	 */
	public static Contacts deserialiseContacts (String contactFileName) throws ContactManagerException {
		try (FileInputStream fis= new FileInputStream(contactFileName); 
				ObjectInputStream ois= new ObjectInputStream(fis)){
			return (Contacts)ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			throw new ContactManagerException(e.getMessage());
		}
	}
	public static Contacts deserialiseContacts () throws ContactManagerException {
		return deserialiseContacts(getFileName());
	}
	/**
	 * @param <T>
	 * @param critere
	 * @return Contact if found, else null
	 * @throws ContactManagerException 
	 */
	public static <T> Contact searchContact (T critere) throws ContactManagerException {
		Contacts contacts = deserialiseContacts();
		if(critere instanceof Integer) return contacts.find((int) critere);
		else if(critere instanceof String) return contacts.find((String)critere);
		return null;
		
	}
	/**
	 * @param contact
	 * @throws ContactManagerException 
	 */
	public static void updateContact (Contact contact) throws ContactManagerException {
		Contacts contacts= deserialiseContacts();
		if(null!=contacts.find(contact.getId()))
			throw new ContactManagerException("Le contact avec l'id "+contact.getId()+" n'existe pas.");
		contacts.update(contact);
		serialiseContacts(contacts);
	}
	/**
	 * @param identifiant
	 * @throws ContactManagerException 
	 */
	public static void deleteContact (int identifiant) throws ContactManagerException {
		Contacts contacts= deserialiseContacts();
		if(null!=contacts.find(identifiant))
			throw new ContactManagerException("Le contact avec l'id "+identifiant+" n'existe pas.");
		contacts.delete(identifiant);
		serialiseContacts(contacts);
	}
	
	/**
	 * @throws ContactManagerException 
	 * 
	 */
	public static void displayContacts() throws ContactManagerException {
		Contacts contacts=deserialiseContacts(fileName);
		if(contacts==null) {
			System.out.println("Aucun contact répertorié");
		}else {
			System.out.println(contacts);
		}
		
	}
	
	/**
	 * @throws ContactManagerException 
	 * 
	 */
	public static Contact lireContact() throws ContactManagerException {
		System.out.print("NOM : ");
		String nom=Clavier.lireString();
		
		System.out.println("\nPrénom : ");
		String prenom=Clavier.lireString();
		
		System.out.println("\nTéléphone : ");
		String tel=Clavier.lireString();
		
		System.out.println("\nEmail : ");
		String email=Clavier.lireString();
		
		Contact contact= new Contact(nom, prenom, tel, email);
		
		contact.setId(Contacts.getUniqueId());
		
		return contact;
	}

}
