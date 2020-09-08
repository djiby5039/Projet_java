package com.cmapp.diagrammes;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Point;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.cmapp.exceptions.ContactManagerException;
import com.cmapp.utils.DbService;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import com.cmapp.entities.*;


public class Template extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6745488229470146966L;
	private JPanel panel;
	private JTextField id_field;
	private JTextField nom_field;
	private JTextField prenom_field;
	private JTextField id_Field;
	private JTextField tel_field;
	private JTextField email_field;
	private JTable table;
	
	
	public Template() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(50, 50));
		panel.setSize(new Dimension(150, 150));
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setBounds(new Rectangle(150, 150, 120, 120));
		panel.setForeground(Color.DARK_GRAY);
		panel.setLocation(new Point(50, 50));
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(null);
		
		JRadioButton rdbtnUpdate = new JRadioButton("Update:");
		rdbtnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnUpdate.setBounds(23, 7, 109, 23);
		panel.add(rdbtnUpdate);
		
		JRadioButton rdbtnCreate = new JRadioButton("Create:");
		rdbtnCreate.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnCreate.setBounds(134, 7, 63, 23);
		panel.add(rdbtnCreate);
		
		JLabel lblRecherParId = new JLabel("Recher Par Id:");
		lblRecherParId.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblRecherParId.setBounds(222, 11, 90, 14);
		panel.add(lblRecherParId);
		
		id_field = new JTextField();
		id_field.setBounds(399, 8, 160, 20);
		panel.add(id_field);
		id_field.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(322, 8, 44, 22);
		panel.add(comboBox);
		
		JButton btnSearch = new JButton("Search:");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// recuperer soit l'id ou le nom du contact
				// suivant le critère choisi on fait la recherche dans la liste de contacts
				// on affiche le ou les résultats obtenues
			}
		});
		btnSearch.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSearch.setBounds(591, 7, 100, 23);
		panel.add(btnSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(250, 250));
		panel_1.setSize(new Dimension(150, 150));
		getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNom.setBounds(10, 67, 46, 14);
		panel_1.add(lblNom);
		
		nom_field = new JTextField();
		nom_field.setBounds(53, 64, 147, 20);
		panel_1.add(nom_field);
		nom_field.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom:");
		lblPrenom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblPrenom.setBounds(10, 127, 46, 14);
		panel_1.add(lblPrenom);
		
		prenom_field = new JTextField();
		prenom_field.setBounds(53, 124, 147, 20);
		panel_1.add(prenom_field);
		prenom_field.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblId.setBounds(10, 26, 46, 14);
		panel_1.add(lblId);
		
		id_Field = new JTextField();
		id_Field.setEditable(false);
		id_Field.setBounds(53, 23, 147, 20);
		panel_1.add(id_Field);
		id_Field.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telephone:");
		lblTelephone.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTelephone.setBounds(0, 180, 72, 14);
		panel_1.add(lblTelephone);
		
		tel_field = new JTextField();
		tel_field.setBounds(53, 177, 147, 20);
		panel_1.add(tel_field);
		tel_field.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 238, 46, 14);
		panel_1.add(lblEmail);
		
		email_field = new JTextField();
		email_field.setBounds(53, 235, 147, 20);
		panel_1.add(email_field);
		email_field.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 279, 250, 2);
		panel_1.add(separator);
		
		JLabel lblDataSource = new JLabel("Data Source:");
		lblDataSource.setForeground(Color.BLUE);
		lblDataSource.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDataSource.setBounds(10, 306, 72, 14);
		panel_1.add(lblDataSource);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(92, 303, 132, 20);
		panel_1.add(comboBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(110, 110));
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(60, 60));
		panel_2.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Creer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contact contact = new Contact(nom_field.getText(),prenom_field.getText(),
						tel_field.getText(),email_field.getText());
				// récupérer le nom du fichier dans lequel on veut ajouter le ccontact
				// System.out.println(contact.toString());
				// ajout de ce contact dans la liste de contacts
				// sauvegarde dans la base de données
				// effacer les zones de texte pour la prochaine opération
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 11, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DbService affiche = new DbService();
				try {
					affiche.afficherLaListeDesContacts();
				} catch (ContactManagerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(109, 11, 89, 23);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//  récuperer le contact que l'on veut supprimer
				// supprimer le contact de la liste
				// mettre a jour la table au niveau de l'affichage
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2.setBounds(208, 11, 89, 23);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// fermer la fenetre en cours
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_3.setBounds(426, 11, 89, 23);
		panel_4.add(btnNewButton_3);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnClear.setBounds(309, 11, 89, 23);
		panel_4.add(btnClear);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(512, 326));
		panel_6.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		this.setVisible(true); 
		
		      
		}
}
