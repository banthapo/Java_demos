package interfaceClasses;

public interface BikeInterface {
    /* Interface objects act as a contract enforcer to classes that implements it
     * if a class implements an interface, it must have all the methods defined in that
     * particular interface
     * -> interface methods must always be public :: of which 'public' declaration
     *  may be omitted */


    public String bland = "Honda"; //✔️️

    /* You cannot declare a variable in an interface without initializing them */
//    public String imei; ❌
    void horsePower(float horsePower);

    void speed(int speed);

    void price(double price);


    /* you can declare a class in an interface */
    class Sample {
        private boolean innerClass;

        public Sample(boolean innerClass) {
            this.innerClass = innerClass;
        }

        public boolean isInnerClass() {
            return innerClass;
        }

        public void setInnerClass(boolean innerClass) {
            this.innerClass = innerClass;
        }

        boolean needMaintenance(float miles) {
            boolean maintain = false;
            if ((float) miles > 10000.5) {
                maintain = true;
                System.out.println("Maintainance needed");
            }

            if ((float) miles <= 10000.5) {
                maintain = false;
                System.out.println("Not yet to be maintained");
            }

            return maintain;
        }
    }

    ;

    /* you can even have an interface inside an interface -- amazing */
    interface Demo {
        void example();
    }
}
