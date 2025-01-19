package test_one;

import java.util.LinkedList;

public class Contacts implements ContactsInterface {
    private LinkedList<Contact> contacts = new LinkedList<>();

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

    @Override
    public void viewContact() {
        System.out.println(contacts.size());
    }
}
