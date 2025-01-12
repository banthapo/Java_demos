package interfaceClasses;

public class Main {
    public static void main(String[] args) {
        /* defining an instance of a class by the interface it implements */
        BikeInterface bike1 = new Bicycle();

        /* defining an instance of a class by its class */
        Bicycle bike2 = new Bicycle();

        bike2.horsePower(20);

        bike1.horsePower(400000);

        MotorBike bike = new MotorBike("Honda");

        bike.price(500000);

        /* calling an inner class of an implemented interface */
        BikeInterface.Sample innerInstance = new BikeInterface.Sample(true) ;

        innerInstance.needMaintenance(4000);

        bike2.capacity(3);

    }
}
