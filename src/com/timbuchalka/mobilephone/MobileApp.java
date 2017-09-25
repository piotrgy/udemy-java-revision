package com.timbuchalka.mobilephone;


import java.util.Scanner;

public class MobileApp {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactList contactList = new ContactList();

    public static void main(String[] args) {

        String[] names = {"Adam", "Ola", "Basia", "Janek"};
        String[] numbers = {"506233145", "505289145", "512233145", "533033945"};

        for (int i = 0; i < names.length; i++) {
            Contact contact = new Contact(names[i], numbers[i]);
            contactList.addContact(contact);
        }

        contactList.displayContacts();

        /*contactList.isFoundContactByName("Ola");
        contactList.isFoundContactByName("Zenek");

        Contact modifiedContact = new Contact("Julek", "502134798");
        contactList.modifyContact("Adam", modifiedContact);
        contactList.modifyContact("Franek", modifiedContact);
        contactList.displayContacts();

        contactList.removeContact("Janek");
        contactList.removeContact("Edek");
        contactList.displayContacts();*/

        boolean quit = false;
        int choice;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contactList.displayContacts();
                    break;
                case 2:
                    addMobileContact();
                    break;
                case 3:
                    modifyMobileContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
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

    public static void addMobileContact() {
        System.out.print("Please enter the contact's name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter the contact's phone number: ");
        String phoneNumber = scanner.nextLine();

        contactList.addContact(new Contact(name, phoneNumber));
    }

    public static void modifyMobileContact() {
        System.out.println("Enter current contact name: ");
        String searchingName = scanner.nextLine();
        if (contactList.isFoundContactByName(searchingName)) {
            System.out.println("Enter new name for contact " + searchingName + ": ");
            String newName = scanner.nextLine();
            System.out.println("Enter new phone number for this contact: ");
            String newPhoneNumber = scanner.nextLine();
            Contact modyfiedContact = new Contact(newName, newPhoneNumber);
            contactList.modifyContact(searchingName, modyfiedContact);
        }
    }
}
