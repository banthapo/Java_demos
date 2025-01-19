package test_one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Messages messages = new Messages();
        Options options = new Options();

        greeting();

//        contacts.addContact(new Contact("Lonje", "Banthapo","b@me.com",40, 88846764));
//        contacts.addContact(new Contact("Dan", "Banthapo","d@me.com",20, 99946764));


        contacts.viewContact();
    }

    static void greeting() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your name :: ");
                String name = scanner.nextLine();
                try {
                    Thread.sleep(1500);
                    System.out.println("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Hello " + name + "\n");
                            }
        });
        thread.start();

        Options options = new Options();
        options.handleInitialOpt();

    }
}
