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
    public void removeContact(int i) {
        contacts.remove(i);
    }

    @Override
    public void editContact() {

    }

    public void viewContact(Contact contact) {
        System.out.println("Name :: " + contact.getFirstName() + " " + contact.getSurname());
        System.out.println("Email :: " + contact.getEmail());
        System.out.println("Phone :: " + contact.getPhone());
        System.out.println("Age :: " + contact.getAge() + "\n");;
    }
}
