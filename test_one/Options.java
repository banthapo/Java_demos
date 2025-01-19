package test_one;

import java.util.Scanner;

public class Options {
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
                Scanner scanner = new Scanner(System.in);
                int opt = 0;
                try {
                    opt = scanner.nextInt();
                } catch (Exception e) {
                    handleInitialOpt();
                }

                switch (opt) {
                    case 0: {
                        handleInitialOpt();
                    }
                    case 1: {
                        contactsOpt();

                    }
                    case 2:{
                        messagesOpt();
                    }
                    case 3:{
                        return;
                    }
                    default:{
                        handleInitialOpt();
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

    private void messagesOpt() {
        System.out.println("Manage messages...");
        System.out.println("\t1. View messages list");
        System.out.println("\t2. Send message");
        System.out.println("\t5. Return to previous menu\n");
    }


}























