package com.cmapp.utils;

import javax.swing.JTable;

import com.cmapp.entities.Contact;
import com.cmapp.exceptions.ContactManagerException;
import com.esmt.formation.java.clavier.Clavier;

public class DbService implements IService {

	@Override
	public void creerNouvelleListe() throws ContactManagerException {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void ajouterUnContact() throws ContactManagerException {
		// TODO Auto-generated method stub
		Contact contact =  ContactManager.lireContact();
		String nomTable = ContactManager.getFileName();
		 DbContactManager.addContact(contact, nomTable);
		    
		}

	@Override
	public void afficherLaListeDesContacts(String table) throws ContactManagerException {
		// TODO Auto-generated method stub
		       DbContactManager.displayContacts(table);
		        
		
	}

	@Override
	public void rechercherUnContactSelonSonId() throws ContactManagerException {
		// TODO Auto-generated method stub
		
		     
		
		
	}

	@Override
	public void rechercherUnContactSelonSonNom() throws ContactManagerException {
		// TODO Auto-generated method stub
		
		String nom = Clavier.lireString();
		DbContactManager.searchContact(nom);
		
		
	}

	@Override
	public void supprimerUnContact() throws ContactManagerException {
		// TODO Auto-generated method stub
		System.out.println("Donner l'id de l'utilisateur");
		int id = Clavier.lireInt();
		DbContactManager.deleteContact(id);
		
		
	}

	@Override
	public void mettreAJourUnContact() throws ContactManagerException {
		// TODO Auto-generated method stub
		DbContactManager  contact = new DbContactManager() ;
		
		
	}

	@Override
	public void afficherLaListeDesContacts() throws ContactManagerException {
		// TODO Auto-generated method stub
		
	}

}
