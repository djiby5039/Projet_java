package com.esmt.formation.java.jdbc;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class Testconnexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try (Connection connection = DBManager.getConnection()){
		JOptionPane.showMessageDialog( null , "Connexion à la base OK.");
		}
		catch (Exception e ) {
		JOptionPane.showMessageDialog (null , e .getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
}}}
