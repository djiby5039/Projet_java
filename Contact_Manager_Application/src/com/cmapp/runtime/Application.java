package com.cmapp.runtime;

import com.cmapp.diagrammes.Template;
import com.cmapp.enums.Fonctionnalites;
import com.cmapp.exceptions.ContactManagerException;
import com.cmapp.utils.IService;
import com.cmapp.utils.Service;
import com.esmt.formation.java.clavier.Clavier;

public class Application {

	public static void main(String[] args) {
		
		Application application = new Application();
		application.run();
		
		
		//Template test = new Template();
		
}

	public void run () {
		
		System.out.println("Voulez vous utiliser l'interface graphique?");
		System.out.println("Tapez '1 -' pour la aller sur l'interface graphique? ?");
		System.out.println("Tapez 'autre -' pour l'interface graphique?");
		int i = Clavier.lireInt();
		if (i == 1 )
			{
				Template test = new Template();
			}
		else
		{
			Fonctionnalites fonctionnaliteChoisie = null;
			IService service = new Service ();		
			
			do {
				try {
					displayMenu();
					fonctionnaliteChoisie = getFonctionnalite ();
					
					switch (fonctionnaliteChoisie) {
						case ADD:
							service.ajouterUnContact();
							break;
							
						case CREATE:
							service.creerNouvelleListe();
							break;
							
						case DELETE:
							service.supprimerUnContact();
							break;
							
						case DISPLAY:
							service.afficherLaListeDesContacts();
							break;
							
						case READBYID:
							service.rechercherUnContactSelonSonId();
							break;
							
						case READBYNAME:
							service.rechercherUnContactSelonSonNom();
							break;
							
						case UPDATE:
							service.mettreAJourUnContact();
							break;
							
						case EXIT:
							System.out.println("Merci de votre visite ! Aurevoir !");
					}
				} catch (ContactManagerException e) {
					System.err.println("Error : " + e.getMessage());
				}
			} while (fonctionnaliteChoisie != Fonctionnalites.EXIT);
		}
		
	}
	
	/**
	 * @return
	 * @throws ContactManagerException
	 */
	private Fonctionnalites getFonctionnalite() throws ContactManagerException {
		Fonctionnalites [] fonctionnalites = Fonctionnalites.values();
		int selection = Clavier.lireInt ();
		
		if (selection <= 0 || selection > fonctionnalites.length) {
			throw new ContactManagerException("La séléction n'est pas correcte.");
		}
		
		return fonctionnalites[selection - 1];	
	}

	/**
	 * 
	 */
	public void displayMenu () {
		Fonctionnalites [] fonctionnalites = Fonctionnalites.values();
		for (int i = 0 ; i < fonctionnalites.length ; i ++) {
			System.out.println( (i + 1) + ">> " + fonctionnalites[i]);
		}
		
		System.out.print(">_ ");
	}
}
