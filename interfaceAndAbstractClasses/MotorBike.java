package interfaceAndAbstractClasses;

public class MotorBike implements BikeInterface, BikeInterface.Demo {
    private String bland;

    public MotorBike(String bland) {
        this.bland = bland;
    }

    public String getBland() {
        return bland;
    }

    public void setBland(String bland) {
        this.bland = bland;
    }

    @Override
    public void speed(int speed) {
        System.out.println("Speed of motor bike is :: " + speed + "\n");
    }

    @Override
    public void price(double price) {
        System.out.println("\tThe price of the bike is :: " + price + "\n");
    }

    @Override
    public void horsePower(int horsePower) {
        System.out.println("\t\tThe motorbike runs at the power of :: " + horsePower + "\n");
    }

    @Override
    public void example() {

    }
}
