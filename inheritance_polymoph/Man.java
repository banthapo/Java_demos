package inheritance_polymoph;

public class Man extends Human {
    private String wifeName;

    public Man(String name, int age, String gender, String lace, String wifeName) {
        super(name, age, gender, lace);
        this.wifeName = wifeName;
    }

    public void manData() {
        System.out.println("Name :: " + getName());
        System.out.println("Age :: " + getAge());
        System.out.println("Gender :: " + getGender());
        System.out.println("lace :: " + getLace());
        System.out.println("Wife's Name :: " + wifeName);
        System.out.println("");

    }

    public void manDataShot() {
        super.humanData();
        System.out.println("Wife's Name :: " + wifeName);
        System.out.println("");

    }

}
