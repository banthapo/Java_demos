package interfaceAndAbstractClasses;

public class Bicycle implements BikeInterface {
    @Override
    public void speed(int speed) {
        System.out.println("Bicycle runs at :: " + speed + "km/h\n");
    }

    @Override
    public void price(double price) {
        System.out.println("The bycycle is sold @ a price of :: " + price + "MKW\n");
    }

    @Override
    public void horsePower(int horsePower) {
        if (horsePower <= 50)
            System.out.println("The bike has the power of " + horsePower + " horses");
        else System.out.println("That's not a bicycle!!!");
    }
}
