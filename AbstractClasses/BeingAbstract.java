package AbstractClasses;

public abstract class BeingAbstract {
    public static String type;
    /* You can declare a variable in an interface without initializing them */
    private String name;
    private String race;
    private int age;

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        BeingAbstract.type = type;
    }

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getRace();

    public abstract void setRace(String race);

    public abstract int getAge();

    public abstract void setAge(int age);

    public void getDetails() {
        System.out.println("Type of being :: " + this.type);
        System.out.println("Name of being :: " + this.getName());
        System.out.println("Race of being :: " + this.getRace());
        System.out.println("Age of being :: " + this.getAge());
        System.out.println("");
    }
}
