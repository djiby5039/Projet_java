package com.cmapp.exceptions;

public class ContactManagerException extends Exception {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param message
	 */
	public ContactManagerException(String message) {
		super (message);
	}
}
