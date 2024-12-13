package classes_lesson;

public class Car {
    String name;
    private String numberPlate;
    private String model;
    private String purchaseDate;

    public Car(String numberPlate, String model, String purchaseDate) {
        this.numberPlate = numberPlate;
        this.model = model;
        this.purchaseDate = purchaseDate;

    }

    public Car(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String fullDetails() {
        String fullDetails = "Car name:: " + name + "; Model:: " + model + "; Number Plate:: " + numberPlate
                + "; Purchase date:: " + purchaseDate;

        return fullDetails;
    }

}
