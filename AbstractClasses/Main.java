package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        human();
        leopard();
    }

    public static void human() {
        BeingAbstract.type = "Human";
        BeingAbstract being = new Being("Lonjezo Chijuwa", "Black African", 25);

        being.getDetails();

        Being.type = "Human";
        Being being1 = new Being("Daniel Banthapo", "Black American", 10);

        being1.getDetails();
    }

    public static void leopard() {
        BeingAbstract being = new Being("Night", "African leopard", 13);
        BeingAbstract.setType("Leopard");

        being.getDetails();
    }
}
