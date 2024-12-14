package inheritance;

public class Woman extends Human {
    private String husbandName;

    public Woman(String name, int age, String gender, String lace, String husbandName) {
        super(name, age, gender, lace);
        this.husbandName = husbandName;
    }

    public void womanData() {
        System.out.println("Name :: " + getName());
        System.out.println("Age :: " + getAge());
        System.out.println("Gender :: " + getGender());
        System.out.println("lace :: " + getLace());
        System.out.println("Husband's Name :: " + husbandName);
        System.out.println("");

    }

    public void womanDataShot() {
        super.humanData();
        System.out.println("Husband's Name :: " + husbandName);
        System.out.println("");
    }

}
