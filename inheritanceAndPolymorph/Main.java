package inheritanceAndPolymorph;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Ana Phiri", 28, "Female", "African", "Chifundo Kambuzi");
        Man man = new Man("Dan Mavuto", 23, "Male", "American", "Grace Kamoyo");
        Man man2 = new Man("Mavuto kapolo");

        // System.out.println("Printing out human details.");
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

        System.out.println("printing out man's name only.");
        System.out.println("Man two name :: " + man2.getName());
        System.out.println("Man one name :: " + man.getName());

        //calling a polymorphed method in Man class
        man.eat();
        System.out.println("");
        man.eat("Mangoes");


    }

}
