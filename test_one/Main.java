package test_one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Messages messages = new Messages();
        Options  options = new Options();

        contacts.addContact(new Contact("Lonje", "Banthapo", "b@me.com", 40, 88846764));
        contacts.addContact(new Contact("Dan", "Banthapo", "d@me.com", 20, 99946764));
        greeting();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(120000);
                    System.out.println("\n\n\t****System timeout!!!****");

                    System.exit(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    static void greeting() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                String name = null;
                try {
                    System.out.print("Enter your name :: ");
                    name = scanner.nextLine();
                    Thread.sleep(1000);
                    System.out.println("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Hello " + name + " ...");

                Options options = new Options();
                options.handleInitialOpt();
            }
        });
        thread.start();
    }
}
