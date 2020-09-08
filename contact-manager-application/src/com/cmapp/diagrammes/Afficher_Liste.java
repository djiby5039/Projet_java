package com.cmapp.diagrammes;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.cmapp.utils.DbContactManager;
import com.cmapp.utils.DbService;

public class Afficher_Liste  extends JFrame { 
	
	
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = -5884402419301598452L;

		public Afficher_Liste() {
	        super();
	 
	        setTitle("La liste des contacts");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        Object[][] donnees = {
	       
	        		        
	        };
	 
	        String[] entetes = {"Nom", "prenom", "telephone", "email"};
	 
	        JTable tableau = new JTable(donnees, entetes);
	 
	        getContentPane().add(new JScrollPane(tableau), BorderLayout.NORTH);
	 
	        pack();
	        this.setVisible(true);
	    }
	 
	    
	}


