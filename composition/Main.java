package composition;

public class Main {
    public static void main(String[] args) {
        /*One of  the ways you may instantiate an engine object/class for car class */
        Car honda = new Car("honda", "blue", 4, new Engine("Audi", 5000, 600000.788));
        System.out.printf("Engine model :: %s%n", honda.getEngine().getModel());

        /*Another way of instantiating an object for a class
        * by first instantiating the object to be used in the Car object*/
        FuelSys fuelSys = new FuelSys(60, 4, 2020);
        Car toyota = new Car("toyota", "black", 2, fuelSys);

        System.out.println("Fuel tank  for Toyota :: " + toyota.getFuelSys().getLitres());

    }
}
