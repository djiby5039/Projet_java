package com.cmapp.enums;

public enum Fonctionnalites {
	CREATE("Créer une nouvelle liste de contact..."),
	ADD("Ajouter un nouveau contact..."),
	DELETE("Supprimer un contact..."),
	UPDATE("Mettre à jour un contact..."),
	READBYID("Rechercher un contact par son identifiant..."),
	READBYNAME("Rechercher un contact par son nom..."),
	DISPLAY("Afficher la liste des contacts..."),
	EXIT("Quitter...");
	
	private String name="";
	
	private Fonctionnalites(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
