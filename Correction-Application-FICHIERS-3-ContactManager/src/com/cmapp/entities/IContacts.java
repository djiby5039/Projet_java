package com.cmapp.entities;

import java.util.Comparator;

public interface IContacts {
	/**
	 * 
	 */
	public void sort();
	/**
	 * 
	 * @param comparator
	 */
	public void sort(Comparator<Contact> comparator);
	/**
	 * 
	 * @param id
	 */
	public void delete(int id);
	/**
	 * 
	 * @param contact
	 */
	public void update(Contact contact);
	/**
	 * 
	 * @param contact
	 */
	public void add(Contact contact);
	/**
	 * 
	 * @param id
	 * @return Contact found
	 */
	public Contact find(int id);
	/**
	 * 
	 * @param nom
	 * @return Contact found
	 */
	public Contact find(String nom);
	
	
}
