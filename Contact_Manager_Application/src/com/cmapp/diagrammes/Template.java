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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.cmapp.entities.Contact;
import com.cmapp.exceptions.ContactManagerException;
import com.cmapp.utils.ContactManager;
import com.cmapp.utils.DbContactManager;
import com.cmapp.utils.DbManagerConnection;
import com.cmapp.utils.DbService;
import com.esmt.formation.java.clavier.Clavier;

import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ItemEvent;


public class Template extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6745488229470146966L;
	private JPanel panel ;
	private JTextField id_field;
	private JTextField nom_field;
	private JTextField prenom_field;
	public JTextField id_Field;
	private JTextField tel_field;
	private JTextField email_field;
	protected JTable table;

	@SuppressWarnings({ "rawtypes", "unchecked" })
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
		
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 11, 89, 23);
		panel_4.add(btnNewButton);
		
		//affichage dans tableau
        Object[][] donnees = {
                {"","", "", "", ""}
            
        };
 
        String[] entetes = {"Id", "Nom", "Prénom", "Téléphone", "Email"};
 
        
        table = new JTable(donnees, entetes);
		
		JButton btnNewButton_1 = new JButton("Display");
		
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(109, 11, 89, 23);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int row_id = table.getSelectedRow();
				if (row_id >= 0) 
				{
					if(JOptionPane.showConfirmDialog(null, "Voulez vous supprimer le contact") == 0)
					{
						DefaultTableModel model = (DefaultTableModel) table.getModel();
			            int id_contact_to_delete = (int) table.getValueAt(row_id, 0);
			            try {
							DbContactManager.deleteContact(id_contact_to_delete);
							model.removeRow(row_id);
						} catch (ContactManagerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			            JOptionPane.showMessageDialog(null, "Contact Deleted");
			        }
				}
				else if( !id_Field.getText().toString().isEmpty()) {
					int id = Integer.parseInt(id_Field.getText());
					try {
						DbContactManager.deleteContact(id);
						JOptionPane.showMessageDialog(null, "Contact Deleted");
					} catch (ContactManagerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        }
				else {
					
		            JOptionPane.showMessageDialog(null, "Unable To Delete contact");
		        }
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2.setBounds(208, 11, 89, 23);
		panel_4.add(btnNewButton_2);
		
		JButton btn_exit = new JButton("Exit");
		
		btn_exit.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn_exit.setBounds(426, 11, 89, 23);
		panel_4.add(btn_exit);
		
		JButton btnClear = new JButton("Update");
		
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnClear.setBounds(309, 11, 89, 23);
		panel_4.add(btnClear);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("Clear");
		scrollPane.setPreferredSize(new Dimension(512, 326));
		panel_6.add(scrollPane);
		
		

		
		
		comboBox_1.addItem("default");
		comboBox_1.addItem("liste contacts");
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
			}
		});
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		btnSearch.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				try {
					DbContactManager search = new DbContactManager();
					try {
						JOptionPane.showMessageDialog(null,search.searchContact(Integer.parseInt(id_field.getText())).toString());
						
				    } catch (NumberFormatException nfe) {
				    	JOptionPane.showMessageDialog(null,search.searchContact(id_field.getText()).toString());
				    }
											
										
				} catch (ContactManagerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// récupérer le nom du fichier dans lequel on veut ajouter le contact
				
			
				// System.out.println(contact.toString());
				//System.out.println(contact.toString());
				// ajout de ce contact dans la liste de contacts
				
				
				// sauvegarde dans la base de données
				Contact contact = new Contact(nom_field.getText(), prenom_field.getText(), tel_field.getText(), email_field.getText());
				try {
					DbContactManager.addContact(contact, "contact");
					JOptionPane.showMessageDialog(null, "Le contact est bien ajouter");
				} catch (ContactManagerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				// effacer les zones de texte pour la prochaine opération
				 
			}

			
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				DbService affiche = new DbService();
				try {
					affiche.afficherLaListeDesContacts("contact");
				} catch (ContactManagerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				table = new JTable(donnees, entetes);*/
				
				try {
					Connection connection = DbManagerConnection.getConnection();
					Statement statement = connection.createStatement();
					String query = "Select * From contact";
					statement.executeQuery(query);
				    ResultSet rs = statement.executeQuery(query);
				    table.setModel(DbUtils.resultSetToTableModel(rs));
				       }
				  catch (SQLException ex) {
				  JOptionPane.showMessageDialog(null, ex);
				   } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				scrollPane.setViewportView(table);
				
			}
		});
		
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JOptionPane.showMessageDialog(null, "Vous avez quitte L'application avec succes");
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Contact contact = new Contact(nom_field.getText(), prenom_field.getText(), tel_field.getText(), email_field.getText());
				contact.setId(Integer.parseInt(id_Field.getText()));
				try {
					DbContactManager.updateContact(contact, "contact");
					JOptionPane.showMessageDialog(null, "Mise a jour reussi");
				} catch (ContactManagerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		});
		
		scrollPane.setViewportView(table);
		this.setSize(1000, 600);
		this.setTitle("CONTACT MANAGER APPLICATION");
		this.getContentPane().setBackground(Color.BLUE);
		this.setVisible(true); 
		
		      
		}
}
