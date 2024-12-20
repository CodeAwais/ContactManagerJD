/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;
import java.util.ArrayList;

/**
 *
 * @author awais
 */
public class ContactManager {
    
    // a comment made in netbeans

	// a comment made in github
    
    // a comment made on the branch "Friend"
	
    private ArrayList<Contact> contactList = new ArrayList<>();

    /*
	Locate a Contact record that matches the email address provided.
	Returns the Contact record if found, null if not found.
    */
    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public Contact findContact(String emailAddress){
        for (Contact contact : contactList)
        {   
            if (contact.getEmailAddress().equals(emailAddress)) 
            {return contact;}
        } 
        return null;
}
        
    public void clearContacts() {
        contactList.clear();
    }
    
  
}


