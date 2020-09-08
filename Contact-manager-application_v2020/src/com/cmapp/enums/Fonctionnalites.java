package com.cmapp.enums;

public enum Fonctionnalites {
	
	CREATE ("Créer une nouvelle liste de contacts ..."),
	ADD ("Ajouter un nouveau contact ..."), 
	DELETE ("Supprimer un contact de la liste de contacts ..."),
	UPDATE ("Mettre à jour un contact ..."),
	READBYID ("Rechercher un contact par son Id ..."),
	READBYNAME ("Rechercher un contact par son Nom ..."),
	DISPLAY ("Afficher la liste des contacts"), 
	EXIT ("Quitter l'application ...");

	private String name = "";

	Fonctionnalites (String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}
}
