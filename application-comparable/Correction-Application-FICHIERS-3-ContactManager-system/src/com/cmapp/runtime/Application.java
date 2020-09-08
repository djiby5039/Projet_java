package com.cmapp.runtime;

import com.cmapp.enums.Fonctionnalites;
import com.cmapp.exceptions.ContactManagerException;
import com.cmapp.utils.Clavier;
import com.cmapp.utils.IService;
import com.cmapp.utils.Service;

public class Application {

	public static void main(String[] args) {
		Application app= new Application();
		app.run();
	}

	public void run() {
		Fonctionnalites fonctionnaliteChoisie=null;
		IService service= new Service();
			do {
				try {
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
				} catch (ContactManagerException e) {
					System.out.println(e.getMessage());
				}
				
			}while(fonctionnaliteChoisie!=Fonctionnalites.EXIT);
	}
	
	public Fonctionnalites getFonctionnalite() {
		Fonctionnalites[] fonctionnalites= Fonctionnalites.values();
		int selection= Clavier.lireInt();
		if(selection>0&&selection<=fonctionnalites.length)
		return fonctionnalites[selection-1];
		else throw new ArrayIndexOutOfBoundsException("La sélection n'est pas correcte!");
	}

	public void displayMenu() {
		Fonctionnalites[] fonctionnalites= Fonctionnalites.values();
		for (int i = 0; i < fonctionnalites.length; i++) {
			System.out.println((i+1)+". "+fonctionnalites[i]);
		}
	}
}
