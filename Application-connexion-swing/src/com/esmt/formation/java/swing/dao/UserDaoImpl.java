package com.esmt.formation.java.swing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.esmt.formation.java.swing.DBManager;

public class UserDaoImpl implements IDAO<User> {

	@Override
	public void create(User entity) throws DAOException {
		// TODO Auto-generated method stub
		try(Connection connection =DBManager.getConnection()) {
		PreparedStatement preparedStatement = connection.
		prepareStatement("Insert into User (login , password) values (?,?)");
		//
		preparedStatement.setString(1, entity.getLogin());
		preparedStatement.setString(2, entity.getPassword());
		
	
		preparedStatement.executeUpdate();
		
		}
		catch (Exception e ) {
		throw new DAOException( e.getMessage());
		}
		
		
	}

	@Override
	public User read(int id) throws DAOException {
		// TODO Auto-generated method stub
		try(Connection connection = DBManager.getConnection()){
			
 PreparedStatement preparedStatement = connection.prepareStatement("Select * From User where id=?");
		    preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.first()){
			
			String login = resultSet.getString("login");
			String password = resultSet.getString("password");
		    User contact = new User(login , password );
		    contact.setId(id);
			 return contact;
			}
			else return null;
			
		}
			catch (Exception e ) {
			throw new DAOException(e.getMessage());
			}
			
		}
		
	@Override
	public List<User> list() throws DAOException {
		// TODO Auto-generated method stub
		
		
		try
		(Connection connection = DBManager.getConnection()) {
		Statement statement = connection.createStatement();
		String query = "Select * From T_User";
		ResultSet resultSet = statement.executeQuery(query);
		List<User> users = new ArrayList<>();
		while (resultSet .next()) {
			int identifiant = resultSet.getInt("id");
		String login = resultSet.getString("login");
		
		String password = resultSet.getString("password");
		
		User user = new User (identifiant,login,password);
		
		
		user.setId(identifiant);
		users.add(user);
		}
		return users;
		}
		catch (Exception e ) {
		throw new DAOException (e.getMessage());
		}
		
	}

	@Override
	public void update(User entity) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement ("Update T_Contact Set login = ?, password = ? Where id = ?");
			
		// 
			preparedStatement.setString(1, entity.getLogin());
			preparedStatement.setString(2, entity.getPassword());
			
		// 
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw new DAOException(e.getMessage());
			}

		
	}

	@Override
	public void delete(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			PreparedStatement preparedStatement = connection. prepareStatement("Delete From User where id = ?");
			preparedStatement.setInt(1, id);
			//
			preparedStatement.executeUpdate();
			} catch (Exception e) {
				throw new DAOException(e.getMessage());
				}
		}

		
	}

	



