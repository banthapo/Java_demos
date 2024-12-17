package composition;

public class Car {
    private String name, color;
    //    private  String color;
    private int doors;

    private Engine engine;
    private FuelSys fuelSys;

    public Car() {
    }

    public Car(String name, String color, int doors, Engine engine) {
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.engine = engine;
    }

    public Car(String name, String color, int doors, FuelSys fuelSys) {
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.fuelSys = fuelSys;
    }

    public FuelSys getFuelSys() {
        return fuelSys;
    }

    public void setFuelSys(FuelSys fuelSys) {
        this.fuelSys = fuelSys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
