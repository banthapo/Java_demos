package inheritance;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Ana Phiri", 28, "Female", "African", "Chifundo Kambuzi");
        Man man = new Man("Dan Mavuto", 23, "Male", "American", "Grace Kamoyo");

        // System.out.println("Printing out HUman details.");
        // man.humanData();
        // woman.humanData();

        // System.out.println("printing out woman details.");
        // woman.womanData();

        // System.out.println("printing out man details.");
        // man.manData();

        System.out.println("printing out woman details using shot code.");
        woman.womanDataShot();

        System.out.println("printing out man details using shot code.");
        man.manDataShot();

    }

}
