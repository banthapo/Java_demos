package inheritance_polymoph;

public class Human {
    private String name;
    private int age;
    private String gender;
    private String lace;

    public Human(String name, int age, String gender, String lace) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lace = lace;
    }

    public Human(String name) {
        this.name = name;
    }

    public void humanData() {
        System.out.println("Name :: " + name);
        System.out.println("Age :: " + age);
        System.out.println("Gender :: " + gender);
        System.out.println("lace :: " + lace);
    }

    public boolean eat(String food) {
        if (food == "meat") {
            System.out.println("Man does eats :: " + food);
            return true;
        }
        System.out.println("Man does not eat :: " + food);
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLace() {
        return lace;
    }

    public void setLace(String lace) {
        this.lace = lace;
    }

}
