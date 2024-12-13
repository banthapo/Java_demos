package classes_lesson;

public class Person {
    private String name;
    private String address;
    private int phone;
    private char gender;

    public Person() {
        System.out.println("Goodbye!!!");
    }

    Person(String name, String address, int phone, char gender) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String fullDetails() {
        String fullDetails = "Name:: " + getName() + "; Phone:: " + getPhone() + "; Address:: " + getAddress()
                + "; Gender:: "
                + getGender();
        return fullDetails;
    }

}
