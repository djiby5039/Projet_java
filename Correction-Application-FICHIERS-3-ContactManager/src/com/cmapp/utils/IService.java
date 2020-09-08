package com.cmapp.utils;

import com.cmapp.exceptions.ContactManagerException;

public interface IService {
	public void creerNouvelleListe() throws ContactManagerException;
	public void ajouterContact() throws ContactManagerException;
	public void afficherListeContacts() throws ContactManagerException;
	public void rechercherContactSelonId();
	public void rechercherContactSelonNom();
	public void supprimerContact();
	public void metttreAJourContact();
}
