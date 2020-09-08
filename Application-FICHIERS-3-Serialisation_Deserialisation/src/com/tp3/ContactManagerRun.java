package com.tp3;

public class ContactManagerRun {

	public static void main(String[] args) {
		try {
			Contact met= new Contact(4, "Mouhamed", "Ndiaye", 774437377, "met@rew.com");
			Contact louf= new Contact(1, "Fallou","Faye",773773390,"louf@mram.com");
			
			ContactManager.addContact(met);
			ContactManager.addContact(louf);
			
			ContactManager.deserialiseContacts("contacts.ser");
			
		} catch (ContactManagerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
