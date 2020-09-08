package com.cmapp.utils;

import com.cmapp.entities.Contact;
import com.cmapp.exceptions.ContactManagerException;

public class Service implements IService{

	@Override
	public void creerNouvelleListe() {
		// TODO Auto-generated method stub
		System.out.println("\n- DEBUT CREATION NOUVELLE LISTE-");
		String fileName = getDataSource();
		if(!fileName.equals("default")) {
			ContactManager.setFileName(fileName);
		}
		
	}

	@Override
	public void ajouterContact() throws ContactManagerException {
		// TODO Auto-generated method stub
		System.out.println("\n- DEBUT AJOUT DE CONTACT -");
		
		Contact contact = ContactManager.lireContact();
		String fileName = getDataSource();
		
		if(!fileName.equals("default")) {
			ContactManager.setFileName(fileName);
		}
		ContactManager.addContact(contact);
		System.out.println("\n- FIN AJOUT DE CONTACT -");
		
	}

	private String getDataSource() {
		// TODO Auto-generated method stub
		System.out.println("Entrez le nom du fichier de contact svp(tapez 'default si vous')");
		return Clavier.lireString();
	}

	@Override
	public void afficherListeContacts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rechercherContactSelonId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rechercherContactSelonNom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerContact() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metttreAJourContact() {
		// TODO Auto-generated method stub
		
	}

}
