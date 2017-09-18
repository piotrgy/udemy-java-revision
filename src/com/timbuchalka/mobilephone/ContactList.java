package com.timbuchalka.mobilephone;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {

        if (findContact(contact.getName()) >=0) {
            System.out.println("Contact: "+ contact.getName() + " already exists, enter another name.");
        }else {
            contacts.add(contact);
            System.out.println("Added contact: " + contact.getName());
        }
    }

    public void displayContacts() {
        int listSize = contacts.size();
        System.out.println("You have " + listSize + " contacts in your address book.");
        for (int i = 0; i < listSize; i++) {
            System.out.println((i + 1) + ". " + contacts.get(i).getName() + ", number: " + contacts.get(i).getPhoneNumber());
        }
    }

        private int findContact(String searchedContactName) {
        String existedContactName;
        for (int i = 0; i < this.contacts.size() ; i++) {
            existedContactName = contacts.get(i).getName();
            if (existedContactName.equalsIgnoreCase(searchedContactName)){
                return i;
            }
        }
        return -1;
    }


}
