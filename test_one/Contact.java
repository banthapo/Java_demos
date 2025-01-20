package test_one;

public class Contact {
    private String firstName;
    private String surname;
    private String email;
    private int age;
    private long phone;

    public Contact(String firstName, String surname, String email, int age, long phone) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
