/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ice4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author awais
 */
public class ContactManagerTest {
    
    private ContactManager contactManager;
    
    public ContactManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        contactManager = new ContactManager();
        
        Contact contact1 = new Contact();
        contact1.setFirstName("James");
        contact1.setLastName("Arthur");
        contact1.setEmailAddress("james@gmail.com");
        
        Contact contact2 = new Contact();
        contact2.setFirstName("Emily");
        contact2.setLastName("Wilson");
        contact2.setEmailAddress("emily@gmail.com");
        
        Contact contact3 = new Contact();
        contact3.setFirstName("Hallow");
        contact3.setLastName("John");
        contact3.setEmailAddress("hallow@gmail.com");
        
        Contact contact4 = new Contact();
        contact4.setFirstName("Steven");
        contact4.setLastName("King");
        contact4.setEmailAddress("steven@gmail.com");
        
        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testFindContact() {    
        Contact contact = contactManager.findContact("james@gmail.com");
          
        assertEquals("James", contact.getFirstName()); //True - They Macth
        assertEquals("Arthur", contact.getLastName()); //True - They Macth
        System.out.println("Test 1 (Good): Email Address Matches");
    
    }
    
    @Test
    public void testFindContact2() {    
        Contact contact = contactManager.findContact("hallow@gmail.com");
          
        assertEquals("Hallow", contact.getFirstName()); //True - They Match
        assertEquals("John", contact.getLastName()); //True - They Match
        System.out.println("Test 2 (Good): Email Address Matches");
    
    }
    
    @Test
    public void testFindNonExistentContact() {   
        
        assertEquals(null, contactManager.findContact("abcd@gmail.com")); 
        //True - They Match Because email dooesnt exist and method returns null
        System.out.println("Test 3 (Bad):Email Address Does Not Match");
    
    }
    
    @Test
    public void testFindNonExistentContact2() {    
        assertEquals(null, contactManager.findContact("123@gmail.com"));
        //True - They Match Because email dooesnt exist and method returns null
        System.out.println("Test 4 (Bad):Email Address Does Not Match");
    
    }
    
    @Test
    public void testEmptyString() {  
        
        Contact contact = contactManager.findContact("");
        
        assertEquals(null, contact); //True - They Match
        
        System.out.println("Test 5 (Empty String): Returns Null");
        

    }
    
}
