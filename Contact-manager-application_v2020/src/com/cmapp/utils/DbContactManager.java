package com.cmapp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cmapp.entities.Contact;

import com.cmapp.exceptions.ContactManagerException;

public class DbContactManager implements IcontactManager {

	public static  void addContact(Contact contact) throws ContactManagerException{
		try (Connection connection = DbManagerConnection.getConnection()) {
			PreparedStatement preparedStatement = connection. prepareStatement("Insert into contact (nom, prenom, telephone, email) values (?,?,?,?)");
		//
			preparedStatement.setString(1, contact.getNom());
			preparedStatement.setString(2, contact.getPrenom());
			preparedStatement.setString(3, contact.getTelephone());
			preparedStatement.setString(4, contact.getEmail());
		//
			preparedStatement.executeUpdate();
		} catch (Exception e) { throw new ContactManagerException(e.getMessage()); }
	};
	
	public static void displayContacts () throws ContactManagerException {
		try (Connection connection = DbManagerConnection.getConnection()) {
			Statement statement = connection.createStatement();
			String query = "Select * From contact";
		ResultSet resultSet = statement.executeQuery(query);
		List<Contact> contacts = new ArrayList<>();
		while (resultSet.next()) {
			int identifiant = resultSet.getInt("id");
			String nom = resultSet.getString("nom");
			String prenom = resultSet.getString("prenom");
			String telephone = resultSet.getString("telephone");
			String email = resultSet.getString("email");
		Contact contact = new Contact (nom, prenom, telephone, email);
		contact.setId(identifiant);
		contacts.add(contact);
		}
		if(contacts.isEmpty()) {
			System.out.println("Aucun contact enregistrÃ©.");
		} else {
			System.out.println(contacts);
		}
		} catch (Exception e) {
			throw new ContactManagerException(e.getMessage());
			}
		
		}
	
	public static  void deleteContact (int id) throws ContactManagerException{
		try (Connection connection = DbManagerConnection.getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement("Delete From contact where id = ?");
			preparedStatement.setInt(1, id);
			//
			preparedStatement.executeUpdate();
			} catch (Exception e) {
				throw new ContactManagerException(e.getMessage());
				}
		}

	
	
	public static  <T> void searchContact (T critere) throws ContactManagerException{
		 
			try (Connection connection = DbManagerConnection.getConnection()){
				if(critere instanceof Integer) {
					PreparedStatement preparedStatement = connection.prepareStatement("Select * From contact where id = ?");
					preparedStatement.setInt(1,(int) critere);
					ResultSet resultSet = preparedStatement.executeQuery();
					if (resultSet.first()) {
						int identifiant = resultSet.getInt("id");
						String nom = resultSet.getString("nom");
						String prenom = resultSet.getString("prenom");
						String telephone = resultSet.getString("telephone");
						String email = resultSet.getString("email");
					Contact contact = new Contact (nom, prenom, telephone, email);
					contact.setId(identifiant);
					System.out.println(contact);
					}
				}
				else if(critere instanceof String) {
					PreparedStatement preparedStatement = connection.prepareStatement("Select * From contact where nom = ?");
					preparedStatement.setString(1, (String) critere);
					ResultSet resultSet = preparedStatement.executeQuery();
					if (resultSet.first()) {
						int identifiant = resultSet.getInt("id");
						String nom = resultSet.getString("nom");
						String prenom = resultSet.getString("prenom");
						String telephone = resultSet.getString("telephone");
						String email = resultSet.getString("email");
					Contact contact = new Contact (nom, prenom, telephone, email);
					contact.setId(identifiant);
					System.out.println(contact);
				
				}
			
			 
			} 
				else System.out.println("non trouvé");
			} catch (Exception e) {
				throw new ContactManagerException(e.getMessage()); }

		
		
	}
}
	

