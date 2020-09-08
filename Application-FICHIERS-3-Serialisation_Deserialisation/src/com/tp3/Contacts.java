package com.tp3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Contacts implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6468125849598633346L;
	private ArrayList<Contact> listeContacts;
	public Contacts(ArrayList<Contact> listeContacts) {
		this.listeContacts= listeContacts;
	}

	public void trier(FullNameComparator fullName) {
		Collections.sort(listeContacts, fullName);
	}
	public void trier(IdComparator id) {
		Collections.sort(listeContacts, id);
	}

	@Override
	public String toString() {
		Iterator<Contact> it=listeContacts.iterator();
		StringBuilder liste= new StringBuilder();
		while(it.hasNext()) {
			liste.append(it.next());
		}
		return ""+liste;
	}
	
	
}

class FullNameComparator implements Comparator<Contact>{
	@Override
	public int compare(Contact o1, Contact o2) {
		String fn1=o1.getNom()+" "+o1.getPrenom();
		String fn2=o2.getNom()+" "+o2.getPrenom();
		return fn1.compareTo(fn2);
	}
}

class IdComparator implements Comparator<Contact>{
	@Override
	public int compare(Contact o1, Contact o2) {
		return o1.getId().compareTo(o2.getId());
	}
	
}