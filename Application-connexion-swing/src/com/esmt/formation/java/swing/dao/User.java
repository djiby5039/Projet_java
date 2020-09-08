package com.esmt.formation.java.swing.dao;

public class User {
	
	private int id;
	private String login;
	private String password;
	/**
	 * @param login
	 * @param password
	 */
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}
	/**
	 * @param id
	 * @param login
	 * @param password
	 */
	public User(int id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}
	
	
	
	/**
	 * 
	 */
	public User() {
	}
	public User(int identifiant, String login2) {
		// TODO Auto-generated constructor stub
	}
	public User(int identifiant) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
