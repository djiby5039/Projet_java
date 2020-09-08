package com.esmt.formation.etudiant;

import com.esmt.formation.Personne;

public class Etudiant extends Personne implements IEtudiant {
              private int matricule;
              private String formation;
              
               /**
			 * @param nom
			 * @param prenom
			 * @param genre
			 * @param age
			 * @param matricule
			 * @param formation
			 */
			public Etudiant(String nom, String prenom, char genre, int age, int matricule, String formation) {
				super(nom, prenom, genre, age);
				this.matricule = matricule;
				this.formation = formation;
			}
			public int getMatricule() {
				return matricule;
			}
			public void setMatricule(int matricule) {
				this.matricule = matricule;
			}
			public String getFormation() {
				return formation;
			}
			public void setFormation(String formation) {
				this.formation = formation;
			}
			@Override
			public String toString() {
				return "Etudiant [matricule=" + matricule + ", formation=" + formation + "]";
			}
			@Override
			public void passerExamen() {
				// TODO Auto-generated method stub
				System.out.println("je veux passer un examen");
				
			}
			@Override
			public void inscrire() {
				// TODO Auto-generated method stub
				System.out.println("je veux minscrire");
				
			}
			@Override
			public void DemandeExoneration() {
				// TODO Auto-generated method stub
				System.out.println("je fais une demande d'exoneration");
				
			}
						
  }
