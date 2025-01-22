package test_one;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Options {
    public LinkedList<Message> messages = Messages.getMessages();
    public LinkedList<Contact> contacts = Contacts.getContacts();
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
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                    scanner.nextInt();
                    handleInitialOpt();
                }
//                finally {
//                    scanner.close();
//                }

                switch (opt) {
                    case 1: {
                        handleContactsOpt();
                        break;

                    }
                    case 2: {
                        handleMessagesOpt();
                        break;
                    }
                    case 3: {
                        return;
                    }
                    default: {
                        System.out.println("Wrong option, try again");
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
        try {
            System.out.print("Select option :: ");
            opt = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            scanner.nextInt();
            System.out.println("Wrong option, try again");
            addContactOpt();
        }
//        finally {
//            scanner.close();
//        }

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
                System.out.println("Wrong option, try again");
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
        boolean contactExist = false;

        for (Contact c : contacts) {
            if (c.getPhone() == contact.getPhone()) contactExist = true;
        }

        if(contactExist){
            System.out.println("\nContact already saved...");
        }else{
        Contacts contacts = new Contacts();
        contacts.addContact(contact);
            System.out.println("\nSuccessfully added contact");
            contacts.viewContact(contact);
            System.out.println("*******************");
        }
        addContactOpt();

    }

    public void searchContact() {
        System.out.println("\nSearch contact...");
        System.out.print("Enter search text \n\t:: ");
        String searchText = scanner.next();

        for (int i = 0; i < contacts.size(); i++) {
            String name = contacts.get(i).getFirstName() + " " + contacts.get(i).getSurname();
            String email = contacts.get(i).getEmail();
            Long phone = contacts.get(i).getPhone();

            boolean found = name.contains(searchText) || email.contains(searchText) || phone.toString().contains(searchText);

            if (found) {
                Contact contact = contacts.get(i);
                System.out.println("\tContact index :: " + (i + 1));
                contactDetails(contact);
            }
        }
        handleContactsOpt();
    }

    public void deleteContact() {
        System.out.println("\nEnter contact name to delete :: ");
        String searchText = scanner.next();
        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {
            String firstname = contacts.get(i).getFirstName();
            String surname = contacts.get(i).getSurname();

            found = firstname.toLowerCase().contains(searchText.toLowerCase()) || surname.toLowerCase().contains(searchText.toLowerCase());

            if (found) {
                System.out.println("\nSuccessfully deleted contact...\n");
                contactDetails(contacts.get(i));
                contacts.remove(i);
                i = contacts.size();
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
        } catch (InputMismatchException e) {
            e.printStackTrace();
            scanner.nextInt();
            System.out.println("Wrong option, try again");
            handleContactsOpt();
        }
//        finally {
//            scanner.close();
//        }

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
                System.out.println("Wrong option, try again");
                handleContactsOpt();
                break;
            }
        }

    }

    private void messagesOpt() {
        System.out.println("\nManage messages...");
        System.out.println("\t1. View messages list");
        System.out.println("\t2. Send message");
        System.out.println("\t3. Return to previous menu\n");
    }

    public void messageDetails(Message msg) {
        System.out.println("\tReceiver :: " + msg.getFirstName() + " " + msg.getSurname());
        System.out.println("\tPhone :: " + msg.getPhone());
        System.out.println("\t\tMessage => " + msg.getMsg());
        System.out.println("\t\t\tDate => " + msg.getDate());
    }

    public void viewMessages() {

        if (messages.size() == 0) {
            System.out.println("\n0 Messages found");
            handleMessagesOpt();
        }

        System.out.println("\nMessages...");
        for (int i = 0; i < messages.size(); i++) {
            messageDetails(messages.get(i));
        }
        handleMessagesOpt();
    }

    void sendMsg() {
        System.out.println("Select contact: using index");
        showContacts();

        int index = 0;
        String msg = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yy");
        Date date = new Date();
        System.out.println(date);
        try {
            System.out.print("Index :: ");
            index = scanner.nextInt();
            System.out.println("Type message :: ");
            System.out.print("\t=> ");
            msg = scanner.next();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            scanner.nextInt();
        }

        if (contacts.get(index - 1) == null) {
            System.out.println("Contact not available");
            handleMessagesOpt();
        } else {
            Contact contact = contacts.get(index - 1);
            Message message = new Message(contact.getFirstName(), contact.getSurname(), contact.getEmail(), contact.getAge(),
                    contact.getPhone(), msg, date);
            messages.add(message);
            System.out.println("Message sent successfully...\n");
            handleMessagesOpt();
        }

    }

    public void handleMessagesOpt() {
        messagesOpt();
        int opt = 0;
        try {
            System.out.print("Select option :: ");
            opt = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            scanner.nextInt();
            System.out.println("Wrong input, try again");
            handleMessagesOpt();
        }
//        finally {
//            scanner.close();
//        }

        switch (opt) {
            case 1: {
                viewMessages();
                break;
            }
            case 2: {
                sendMsg();
                break;
            }
            case 3: {
                handleInitialOpt();
                break;
            }
            default: {
                System.out.println("Wrong input, try again");
                handleMessagesOpt();
                break;
            }
        }

    }


}























