package com.cmapp.utils;

import javax.swing.JTable;

import com.cmapp.entities.Contact;
import com.cmapp.entities.Contacts;
import com.cmapp.exceptions.ContactManagerException;

public interface IService {	
	public void creerNouvelleListe () throws ContactManagerException;
	public void ajouterUnContact () throws ContactManagerException;
	public void afficherLaListeDesContacts () throws ContactManagerException;
	public void rechercherUnContactSelonSonId () throws ContactManagerException;
	public void rechercherUnContactSelonSonNom () throws ContactManagerException;
	public void supprimerUnContact () throws ContactManagerException;
	public void mettreAJourUnContact () throws ContactManagerException;
	void afficherLaListeDesContacts(String table) throws ContactManagerException;
	
}