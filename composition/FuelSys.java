package composition;

public class FuelSys {
    private  int litres;
    private int cylinders;
    private int modelYr;

    public FuelSys(int litres, int cylinders, int modelYr) {
        this.litres = litres;
        this.cylinders = cylinders;
        this.modelYr = modelYr;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getModelYr() {
        return modelYr;
    }

    public void setModelYr(int modelYr) {
        this.modelYr = modelYr;
    }
}
