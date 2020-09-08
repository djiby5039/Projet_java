package com.esmt.formation.java.swing.dao;

import java.util.List;

public interface IDAO<T> {
	
	
	
	public void create (T entity ) throws DAOException;
	public T read ( int id ) throws DAOException;
	public List<T> list () throws DAOException;
	public void update (T entity ) throws DAOException;
	public void delete ( int id ) throws DAOException;
	

}
