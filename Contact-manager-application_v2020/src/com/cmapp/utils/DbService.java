package com.cmapp.utils;

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
		 DbContactManager.addContact(contact);
		    
		}

	@Override
	public void afficherLaListeDesContacts() throws ContactManagerException {
		// TODO Auto-generated method stub
		       DbContactManager.displayContacts();
		        
		
	}

	@Override
	public void rechercherUnContactSelonSonId() throws ContactManagerException {
		// TODO Auto-generated method stub
		System.out.println("Donner l'id dew l'utilisateur");
		int identifiant =Clavier.lireInt();
		
		DbContactManager.searchContact(identifiant);
		
		
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
		
	}

}
