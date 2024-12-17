package composition;

public class Engine {
    private String model;
    private int rpm;
    private double miles;

    public Engine(String model, int rpm, double miles) {
        this.model = model;
        this.rpm = rpm;
        this.miles = miles;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
