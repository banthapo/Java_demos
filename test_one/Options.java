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
                    handleInitialOpt();
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
                        handleInitialOpt();
                        break;
                    }
                }
            }
        });
        thread.start();
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
            System.out.println("\t :: " + i + 1);
            System.out.println("Name :: " + contact.getFirstName() + " " + contact.getSurname());
            System.out.println("Email :: " + contact.getEmail());
            System.out.println("Phone :: " + contact.getPhone());
            System.out.println("Age :: " + contact.getAge() + "\n");
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
            System.out.println("Wrong input");
            addContactOpt();
        }

        switch (opt) {
            case 1: {
                addContact();
                break;
            }
            case 2:{
                contactsOpt();
                handleContactsOpt();
                break;
            }
            default:{
                addContactOpt();
                break;
            }
        }
    }

    public void addContact() {
        System.out.print("Enter firstname :: ");
        String firstname = scanner.next();
        System.out.print("Enter surname :: ");
        String surname = scanner.next();
        System.out.print("Enter phone number :: ");
        int phone = scanner.nextInt();
        System.out.print("Enter email :: ");
        String email = scanner.next();
        System.out.print("Enter age :: ");
        int age = scanner.nextInt();

        Contact contact = new Contact(firstname, surname, email, age, phone);
        Contacts contacts = new Contacts();
        contacts.addContact(contact);
        System.out.println("\nSuccessfully added contact");
        addContactOpt();

//        contacts.viewContact();
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
            default: {
                handleContactsOpt();
            }
        }

    }

    private void messagesOpt() {
        System.out.println("Manage messages...");
        System.out.println("\t1. View messages list");
        System.out.println("\t2. Send message");
        System.out.println("\t5. Return to previous menu\n");
    }


}























