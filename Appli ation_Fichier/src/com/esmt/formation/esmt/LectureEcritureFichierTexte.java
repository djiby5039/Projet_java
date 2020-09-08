package com.esmt.formation.esmt;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureEcritureFichierTexte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try(FileReader fichier = new FileReader("fichier.txt")){
			 BufferedReader br = new BufferedReader(fichier);
			 String LigneLue = null;
			 int NumLigne=0;
			 
			 while((LigneLue = br.readLine())!=null) {
				 NumLigne++;
				 System.out.println(NumLigne+". "+LigneLue);
			 }
			 
			 
		}catch(IOException e){
			
			System.err.println("ERREUR DE TYPE"+e.getMessage());
			
		}

}
}
