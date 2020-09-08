package com.cmapp.utils;

import com.cmapp.entities.Contact;
import com.cmapp.exceptions.ContactManagerException;

public interface IcontactManager {
	public static  void addContact(Contact contact) throws ContactManagerException{};
	public static  <T> void searchContact (T critere) throws ContactManagerException{};
	public static  void updateContact (Contact contact) throws ContactManagerException{};
	public static  void deleteContact (int identifiant) throws ContactManagerException{};
	public static void displayContacts () throws ContactManagerException {};
	
}
