package oop_doctor_test;

public class Patient {
    private String name;
    private int age;
    private boolean male;

    public Patient(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public void patientData() {
        System.out.println("Name :: " + name);
        System.out.println("Age :: " + age);
        if (male)
            System.out.println("Gender :: Male");
        else
            System.out.println("Gender :: Female");
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
