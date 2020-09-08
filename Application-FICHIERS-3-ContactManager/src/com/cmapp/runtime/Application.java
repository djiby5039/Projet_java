package com.cmapp.runtime;

import com.cmapp.enums.Fonctionnalites;
import com.cmapp.exceptions.ContactManagerException;
import com.cmapp.utils.Clavier;
import com.cmapp.utils.IService;
import com.cmapp.utils.Service;

public class Application {

	public static void main(String[] args) throws ContactManagerException {
		Application app= new Application();
		app.run();
	}

	public void run() throws ContactManagerException {
		Fonctionnalites fonctionnaliteChoisie=null;
		IService service= new Service();
		do {
			displayMenu();
			fonctionnaliteChoisie=getFonctionnalite();
			switch(fonctionnaliteChoisie) {
			case ADD:
				service.ajouterContact();
				break;
			case CREATE:
				service.creerNouvelleListe();
				break;
			case DELETE:
				service.supprimerContact();
				break;
			case DISPLAY:
				service.afficherListeContacts();
				break;
			case READBYID:
				service.rechercherContactSelonId();
				break;
			case READBYNAME:
				service.rechercherContactSelonNom();
				break;
			case UPDATE:
				service.metttreAJourContact();
				break;
			case EXIT:
				System.out.println("Bisoux Bye Ciao !");
			}
		}while(fonctionnaliteChoisie!=Fonctionnalites.EXIT);
	}
	
	public Fonctionnalites getFonctionnalite() {
		Fonctionnalites[] fonctionnalites= Fonctionnalites.values();
		int selection= Clavier.lireInt();
		//A controler
		if(selection>0&&selection<fonctionnalites.length)
		return fonctionnalites[selection-1];
		else throw new ArrayIndexOutOfBoundsException("Choisissez une des options proposées svp");
	}

	public void displayMenu() {
		
	}
}
