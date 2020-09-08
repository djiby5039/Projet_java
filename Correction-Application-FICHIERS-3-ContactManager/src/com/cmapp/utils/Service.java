package com.cmapp.utils;

import com.cmapp.entities.Contact;
import com.cmapp.entities.Contacts;
import com.cmapp.exceptions.ContactManagerException;

public class Service implements IService{

	@Override
	public void creerNouvelleListe() throws ContactManagerException {
		System.out.println("\n- DEBUT - CREATION NOUVELLE LISTE DE CONTACTS -");
		String fileName=getDataSource();
		if(!fileName.toLowerCase().equals("default")) {
			ContactManager.setFileName(fileName);
		}
		ContactManager.serialiseContacts(new Contacts());;
		System.out.println("\n- FIN - CREATION NOUVELLE LISTE DE CONTACTS -");
		
	}

	@Override
	public void ajouterContact() throws ContactManagerException {
		System.out.println("\n- DEBUT - AJOUT CONTACT -");
		Contact contact= ContactManager.lireContact();
		String fileName=getDataSource();
		if(!fileName.toLowerCase().equals("default")) {
			ContactManager.setFileName(fileName);
		}
		ContactManager.addContact(contact);
		System.out.println("\n- FIN - AJOUT CONTACT -");
	}

	private String getDataSource() {
		System.out.print("Entrez le nom du fichier de contacts svp\nNB : tapez 'default' si vous voulez utiliser le fichier par défaut\n>");
		return Clavier.lireString();
	}
	@Override
	public void afficherListeContacts() throws ContactManagerException {
		System.out.println("\n- DEBUT - AFFICHAGE LISTE CONTACT -");
		String fileName=getDataSource();
		if(!fileName.toLowerCase().equals("default")) {
			ContactManager.setFileName(fileName);
		}
		ContactManager.displayContacts();
		System.out.println("\n- FIN - AFFICHAGE LISTE CONTACT -");
		
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
