package test_one;

import java.util.LinkedList;

public class Contacts implements ContactsInterface {
    private static LinkedList<Contact> contacts = new LinkedList<>();

    public static LinkedList<Contact> getContacts() {
        return contacts;
    }

    public static void setContacts(LinkedList<Contact> contacts) {
        Contacts.contacts = contacts;
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void removeContact() {

    }

    @Override
    public void editContact() {

    }

    public void viewContact() {
        System.out.println(contacts.size());
    }
}
