package com.cmapp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;

import com.cmapp.diagrammes.Template;
import com.cmapp.entities.Contact;

import com.cmapp.exceptions.ContactManagerException;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DbContactManager implements IcontactManager {

	public static  void addContact(Contact contact, String nomTable ) throws ContactManagerException{
		try (Connection connection = DbManagerConnection.getConnection()) {
			nomTable = "contact";
			PreparedStatement preparedStatement = connection. prepareStatement("Insert into "+nomTable+"(nom, prenom, telephone, email) values (?,?,?,?)");
		//
			
			preparedStatement.setString(1, contact.getNom());
			preparedStatement.setString(2, contact.getPrenom());
			preparedStatement.setString(3, contact.getTelephone());
			preparedStatement.setString(4, contact.getEmail());
		//
			preparedStatement.executeUpdate();
		} catch (Exception e) { throw new ContactManagerException(e.getMessage()); }
	};
	
	public static void displayContacts (String table) throws ContactManagerException {
		table = "contact";
		try (Connection connection = DbManagerConnection.getConnection()) {
			Statement statement = connection.createStatement();
			String query = "Select * From "+ table +"";
		ResultSet resultSet = statement.executeQuery(query);
		ResultSetMetaData resultMeta = (ResultSetMetaData) resultSet.getMetaData();
		
		String[] columnNames = new String[resultMeta.getColumnCount()];
		for (int i = 1; i <= resultMeta.getColumnCount(); i++){   
		    columnNames[i-1]=resultMeta.getColumnName(i);
		}
		
		List<Contact> data = new ArrayList<>();

		while(resultSet.next()) {
			
		    Contact line = new Contact("Nom"); // on créé un tableau pour stocker la ligne courante
		    data.add(line); // on ajoute la ligne à la liste
		}

		if(data.isEmpty()) {
			System.out.println("Aucun contact enregistrÃ©.");
		} else {
			System.out.println();
			
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

	
	
	public static  <T> Contact searchContact (T critere) throws ContactManagerException{
		 
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
					return contact;
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
					return contact;
				}
			
			 
			} 
				else System.out.println("non trouvé");
			} catch (Exception e) {
				throw new ContactManagerException(e.getMessage()); }
			return null;

	}
	
	public static  Contact updateContact(Contact contact, String nomTable ) throws ContactManagerException{
		try (Connection connection = DbManagerConnection.getConnection()) {
			nomTable = "contact";
			PreparedStatement preparedStatement = connection. prepareStatement("update "+nomTable+" set nom = ? , prenom = ? , telephone = ? , email = ? "
					+ "where id = ?"+ "");
		//
			
			preparedStatement.setString(1, contact.getNom());
			preparedStatement.setString(2, contact.getPrenom());
			preparedStatement.setString(3, contact.getTelephone());
			preparedStatement.setString(4, contact.getEmail());
			preparedStatement.setInt(5, contact.getId());
		//
			preparedStatement.executeUpdate();
		} catch (Exception e) { throw new ContactManagerException(e.getMessage()); }
		return contact;
	};
}
	

