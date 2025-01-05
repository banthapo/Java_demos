package inheritanceAndPolymorph;

public class Man extends Human {
    private String wifeName;

    public Man(String name, int age, String gender, String lace, String wifeName) {
        super(name, age, gender, lace);
        this.wifeName = wifeName;
    }
    //polymorphing a constructor to receive just the name
    //polymorphism means having multiple forms
    public Man(String name) {
        super(name);
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

    //polymorphing a method from extended class: "Human"
    @Override
    public boolean eat(String food) {
        return super.eat(food);
    }

//    polymophing a method with different arguments
    public boolean eat(){
        System.out.println("Man eats everything!!!");
        return false;
    }


}
