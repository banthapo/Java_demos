package AbstractClasses;

/* Abstract classes are similar to interfaces only that they have extended options to include
* variables without initializing them and static variables as well
* A class can only extend one abstract class but can implement as many interfaces as required */
public class Being extends BeingAbstract {

    public static String type;
    private String name;
    private String race;
    private int age;


    public Being(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public Being() {
    }

    /* public static variables/methods don't override static variables/methods in the
    * extended abstract class and are not reflect in the extended class */
    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Being.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getRace() {
        return this.race;
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
