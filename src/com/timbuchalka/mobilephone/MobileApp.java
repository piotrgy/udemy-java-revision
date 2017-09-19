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

        contactList.findContactByName("Ola");
        contactList.findContactByName("Zenek");

        Contact modifiedContact = new Contact("Julek", "502134798");
        contactList.modifyContact("Adam", modifiedContact);
        contactList.modifyContact("Franek", modifiedContact);
        contactList.displayContacts();

        contactList.removeContact("Janek");
        contactList.removeContact("Edek");
        contactList.displayContacts();
    }
}
