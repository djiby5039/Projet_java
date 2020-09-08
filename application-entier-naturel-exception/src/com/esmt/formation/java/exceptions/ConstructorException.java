package com.esmt.formation.java.exceptions;

public class ConstructorException extends Exception {
	private Integer value;

	public ConstructorException() {}

	/**
	 * @param message
	 */
	public ConstructorException(String message) {
		super(message);
	}
	
	public ConstructorException(String message, int value) {
		super(message);
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}
