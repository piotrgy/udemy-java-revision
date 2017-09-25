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

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact: " + contact.getName() + " already exists, enter another name.");
        } else {
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

    public void modifyContact(String existedContactName, Contact modyfiedContact) {
        int position = findContact(existedContactName);
        if (position >= 0) {
            contacts.set(position, modyfiedContact);
            System.out.println("Contact " + existedContactName + " is modified. Now the name is: " + modyfiedContact.getName()
                    + " and phone number is: " + modyfiedContact.getPhoneNumber());
        } else {
            System.out.println("The're is no contact named " + existedContactName + " on your list.");
        }
    }

    public boolean isFoundContactByName(String searchedContactName) {
        int index = findContact(searchedContactName);
        if (index >= 0) {
            System.out.println("Contact: " + contacts.get(index).getName() + " is on the " + (index + 1)
                    + "'th" + " position on the list and has a number: " + contacts.get(index).getPhoneNumber());
            return true;
        } else {
            System.out.println("The're is no contact named " + searchedContactName + " on your list.");
            return false;
        }
    }

    private int findContact(String searchedContactName) {
        String existedContactName;
        for (int i = 0; i < this.contacts.size(); i++) {
            existedContactName = contacts.get(i).getName();
            if (existedContactName.equalsIgnoreCase(searchedContactName)) {
                return i;
            }
        }
        return -1;
    }

    public void removeContact(String contactName) {
        int index = findContact(contactName);
        if (index >= 0) {
            contacts.remove(index);
            System.out.println("Contact: " + contactName + " is removed.");
        } else {
            System.out.println("The're is no contact named " + contactName + " on your list.");
        }
    }


}
