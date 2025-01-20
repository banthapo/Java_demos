package test_one;

import java.util.LinkedList;
import java.util.Scanner;

public class Options {
    private Scanner scanner = new Scanner(System.in);

    private void initialOpt() {
        System.out.println("Manage your contacts/messages...");
        System.out.println("\t1. Manage contacts");
        System.out.println("\t2. Manage messages");
        System.out.println("\t3. Quit\n");
    }

    public void handleInitialOpt() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                initialOpt();
                int opt = 0;
                try {
                    System.out.print("Select option : ");
                    opt = scanner.nextInt();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                switch (opt) {
                    case 1: {
                        handleContactsOpt();
                        break;

                    }
                    case 2: {
                        messagesOpt();
                        break;
                    }
                    case 3: {
                        return;
                    }
                    default: {
                        System.out.println("Wrong input");
                        handleInitialOpt();
                        break;
                    }
                }
            }
        });
        thread.start();
    }

    public void contactDetails(Contact contact) {
        System.out.println("Name :: " + contact.getFirstName() + " " + contact.getSurname());
        System.out.println("Email :: " + contact.getEmail());
        System.out.println("Phone :: " + contact.getPhone());
        System.out.println("Age :: " + contact.getAge() + "\n");
    }

    private void contactsOpt() {
        System.out.println("Manage contacts...");
        System.out.println("\t1. Show all contacts");
        System.out.println("\t2. Add a contact");
        System.out.println("\t3. Search for a contact");
        System.out.println("\t4. Delete a contact");
        System.out.println("\t5. Return to previous menu\n");
    }

    public void showContacts() {
        LinkedList<Contact> contacts = Contacts.getContacts();

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println("\tContact index :: " + (i + 1));
            contactDetails(contact);
        }
    }

    public void addContactOpt() {
        System.out.println("\t1. Add another contact");
        System.out.println("\t2. Return");

        int opt = 0;
        System.out.print("Select option :: ");
        try {
            opt = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (opt) {
            case 1: {
                addContact();
                break;
            }
            case 2: {
                handleContactsOpt();
                break;
            }
            default: {
                System.out.println("Wrong input");
                addContactOpt();
                break;
            }
        }
    }

    public void addContact() {
        System.out.println("\nAdd contact...");
        System.out.print("Enter firstname :: ");
        String firstname = scanner.next();
        System.out.print("Enter surname :: ");
        String surname = scanner.next();
        System.out.print("Enter phone number :: ");
        long phone = scanner.nextLong();
        System.out.print("Enter email :: ");
        String email = scanner.next();
        System.out.print("Enter age :: ");
        int age = scanner.nextInt();

        Contact contact = new Contact(firstname, surname, email, age, phone);
        Contacts contacts = new Contacts();
        contacts.addContact(contact);
        System.out.println("\nSuccessfully added contact");
        addContactOpt();

        contacts.viewContact();
    }

    public void searchContact() {
        System.out.println("\nSearch contact...");
        System.out.print("Enter search text \n\t:: ");
        String searchText = scanner.next();

        LinkedList<Contact> contactList = Contacts.getContacts();
//        LinkedList<Contact> filteredList = new LinkedList<>();
        for (int i = 0; i < contactList.size(); i++) {
            String name = contactList.get(i).getFirstName() + " " + contactList.get(i).getSurname();
            String email = contactList.get(i).getEmail();
            Long phone = contactList.get(i).getPhone();

            boolean found = name.contains(searchText) || email.contains(searchText) || phone.toString().contains(searchText);

            if (found) {
                Contact contact = contactList.get(i);
                System.out.println("\tContact index :: " + (i + 1));
                contactDetails(contact);
            }
        }
        handleContactsOpt();
    }

    public void deleteContact() {
        System.out.println("\nEnter contact name to delete...");
        System.out.print("Enter search text \n\t:: ");
        String searchText = scanner.next();
        boolean found = false;

        LinkedList<Contact> contactList = Contacts.getContacts();
        for (int i = 0; i < contactList.size(); i++) {
            String firstname = contactList.get(i).getFirstName();
            String surname = contactList.get(i).getSurname();

            found = firstname.toLowerCase().contains(searchText.toLowerCase()) ||
                    surname.toLowerCase().contains(searchText.toLowerCase());

            if (found) {
                ContactsInterface contacts = new Contacts();
                System.out.println("\nSuccessfully deleted contact...\n");
                contactDetails(contactList.get(i));
                contacts.removeContact(i);
                i = contactList.size();
            }
        }

        if (found) {
            handleContactsOpt();
        } else {
            System.out.println("\nContact not found...\n");
            handleContactsOpt();
        }
    }

    public void handleContactsOpt() {
        contactsOpt();
        int opt = 0;
        try {
            System.out.print("Select option : ");
            opt = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (opt) {
            case 1: {
                showContacts();
                break;
            }
            case 2: {
                addContact();
                break;
            }
            case 3: {
                searchContact();
                break;
            }
            case 4: {
                deleteContact();
                break;
            }
            case 5: {
                handleInitialOpt();
                break;
            }
            default: {
                System.out.println("Wrong input");
                handleContactsOpt();
            }
        }

    }

    private void messagesOpt() {
        System.out.println("\nManage messages...");
        System.out.println("\t1. View messages list");
        System.out.println("\t2. Send message");
        System.out.println("\t5. Return to previous menu\n");
    }


}























