package com.timbuchalka.mobilephone;


public class MobileApp {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        String[] names = {"Adam", "Ola", "Basia", "Janek"};
        String[] numbers = {"506233145", "505289145", "512233145", "533033945"};

        for (int i = 0; i < names.length; i++) {
            Contact contact = new Contact(names[i], numbers[i]);
            contactList.addContact(contact);
        }

        contactList.displayContacts();

        /*contactList.findContactByName("Ola");
        contactList.findContactByName("Zenek");

        Contact modifiedContact = new Contact("Julek", "502134798");
        contactList.modifyContact("Adam", modifiedContact);
        contactList.modifyContact("Franek", modifiedContact);
        contactList.displayContacts();

        contactList.removeContact("Janek");
        contactList.removeContact("Edek");
        contactList.displayContacts();*/
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list contacts.");
        System.out.println("\t 2 - To add a contact to the address book.");
        System.out.println("\t 3 - To modify a contact in the address book.");
        System.out.println("\t 4 - To remove a contact from the address book.");
        System.out.println("\t 5 - To search for a contact in the address book.");
        System.out.println("\t 6 - To quit the application.");
    }
}
