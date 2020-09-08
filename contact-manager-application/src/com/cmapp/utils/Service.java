package com.cmapp.utils;

import com.cmapp.entities.Contact;
import com.cmapp.entities.Contacts;
import com.cmapp.exceptions.ContactManagerException;
import com.esmt.formation.java.clavier.Clavier;

public class Service implements IService {

	@Override
	public void creerNouvelleListe() throws ContactManagerException {
		System.out.println("\n- DEBUT - CREATION NOUVELLE LISTE - ");
		String fileName = getDataSource();
		if (!fileName.equals("default")) {
			ContactManager.setFileName(fileName);
		}
		
		ContactManager.serialiseContacts(new Contacts());
		System.out.println("\n- FIN - CREATION NOUVELLE LISTE - ");
	}

	@Override
	public void ajouterUnContact() throws ContactManagerException {
		
		System.out.println("\n- DEBUT - AJOUT DE CONTACT - ");
		String fileName = getDataSource();
		if (!fileName.equals("default")) {
			ContactManager.setFileName(fileName);
		}
		Contact contact = ContactManager.lireContact();
		
		ContactManager.addContact(contact);		
		System.out.println("Ajout effectu√© avec succ√®s.");
		
		System.out.println("\n- FIN - AJOUT DE CONTACT - ");
	}

	private String getDataSource () {
		
		System.out.println("Entrez le nom du fichier de contact svp (tapez 'default' si vous utilisez le fichier par defaut) : ");
		return Clavier.lireString();
	}
	
	@Override
	public void afficherLaListeDesContacts() throws ContactManagerException {
		System.out.println("\n- DEBUT - AFFICHER LA LISTE DE CONTACTS - ");
		String fileName = getDataSource();
		if (!fileName.equals("default")) {
			ContactManager.setFileName(fileName);
		}
		
		ContactManager.displayContacts();
		System.out.println("\n- FIN - AFFICHER LA LISTE DE CONTACTS - ");
	}

	

	@Override
	public void rechercherUnContactSelonSonId() throws ContactManagerException {
		// TODO Auto-generated method stub
		afficherLaListeDesContacts();
		System.out.println("Veuillez saisir l'id  du contact ‡ chercher");
		 int id =Clavier.lireInt();		
		ContactManager.searchContact(id);		
		System.out.println("Contact trouver");
		
		System.out.println("\n- FIN - Recherche - ");
		
		System.out.println(ContactManager.searchContact(id).toString());
		
	}

	@Override
	public void rechercherUnContactSelonSonNom() throws ContactManagerException {
		// TODO Auto-generated method stub
       
		
		System.out.println("Veuillez saisir le nom du contact ‡ chercher");
		 String nom =Clavier.lireString();		
		ContactManager.searchContact(nom).toString();		
		System.out.println("Contact trouver");
		
		System.out.println("\n- FIN - Recherche - ");
		
		System.out.println(ContactManager.searchContact(nom).toString());
		
		
		
	}

	@Override
	public void supprimerUnContact() throws ContactManagerException {
		// TODO Auto-generated method stub
		afficherLaListeDesContacts();
		
		System.out.println("Veuillez saisir l'id du contact ‡ supprimer");
		 int id =Clavier.lireInt();		
		ContactManager.deleteContact(id);		
		System.out.println("Contact supprimmer avec succes");
		
		System.out.println("\n- FIN - SUPPRESSION CONTACT - ");
		
		afficherLaListeDesContacts();
		
	}

	@Override
	public void mettreAJourUnContact() throws ContactManagerException {
		// TODO Auto-generated method stub
		afficherLaListeDesContacts();
		System.out.println("Veuillez saisir l'id  du contact que vous voulez mettre a jour");
		int id =Clavier.lireInt();	
		Contact contact = ContactManager.searchContact(id);
		
		Contact contact_updated = ContactManager.lireContact();
		
		if( contact_updated.getNom().isEmpty() )
			contact_updated.setNom(contact.getNom());
		
		if( contact_updated.getPrenom().isEmpty() )
			contact_updated.setPrenom(contact.getPrenom());
		
		if( contact_updated.getEmail().isEmpty())
			contact_updated.setEmail(contact.getEmail());
		
		if( contact_updated.getTelephone().isEmpty())
			contact_updated.setTelephone(contact.getTelephone());
		
		contact_updated.setId(id);
	
		
		
		ContactManager.updateContact(contact_updated);
		System.out.println("\n- FIN - DE MISE A JOUR - ");
		
		System.out.println();
		
		
		
	}

}
