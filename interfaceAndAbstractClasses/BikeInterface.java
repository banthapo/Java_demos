package interfaceAndAbstractClasses;

public interface BikeInterface {
    /* Interface objects act as a contract enforcer to classes that implements it
     * if a class implements an interface, it must have all the methods defined in that
     * particular interface
     * -> interface methods must always be public :: of which 'public' declaration
     *  may be omitted */
    void speed(int speed);

    void price(double price);

    void horsePower(int horsePower);

    /* You cannot declare a variable in an interface */
//    public String imei; ❌

    /* you can declare a class in an interface */
    class Sample {
        boolean needMaintenance(float miles) {
            boolean maintain = false;
            if ((float) miles > 10000.5)
                maintain = true;
            if ((float) miles <= 10000.5)
                maintain = false;
            return maintain;
        }
    }

    ;

    /* you can even have an interface inside an interface -- amazing */
    interface Demo {
        void example();
    }
}
