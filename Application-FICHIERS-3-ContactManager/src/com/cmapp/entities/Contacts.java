package com.cmapp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.cmapp.exceptions.ContactManagerException;
import com.cmapp.utils.ContactManager;

public class Contacts implements Serializable, IContacts {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6741931543013158652L;
	
	private List<Contact> liste;
	public Contacts() {
		liste = new ArrayList<>();
	}
	/**
	 * @return the liste
	 */
	public List<Contact> getListe() {
		return liste;
	}
	@Override
	public void sort() {
		Collections.sort(liste);
		
	}
	@Override
	public void sort(Comparator<Contact> comparator) {
		Collections.sort(liste,comparator);
	}
	@Override
	public void delete(int id) {
		  int position = Collections.binarySearch(liste, find(id));
		  try {
		  liste.remove(Math.abs(position));
		  }catch(IndexOutOfBoundsException ignored){}
		  
		}
		
	
	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub
	
		
	}
	@Override
	public void add(Contact contact) {
		int position = Collections.binarySearch(liste, contact);
		liste.add(Math.abs(position)-1, contact);
		
	}
	@Override
	public Contact find(int id) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<liste.size() ; i++) {
			if(liste.get(i).getId()==id) {
				return liste.get(i);			}
		}
	   return null;
	}
	@Override
	public Contact find(String nom) {
		// TODO Auto-generated method stub
		
		
		for(int i = 0; i<liste.size() ; i++) {
			if(liste.get(i).getNom()==nom) {
				return liste.get(i);			}
		}
		return null;
	}
	public static int getUniqueId() throws ContactManagerException {
		Contacts contacts = ContactManager.deserialiseContacts();
		List<Contact> liste = contacts.getListe();
		if(liste.isEmpty()) return 1;
		int maxId = Collections.max(contacts.getListe()).getId();
		
		return maxId + 1;
	}

}
