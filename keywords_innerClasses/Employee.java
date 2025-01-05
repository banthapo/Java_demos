package keywords_innerClasses;

public class Employee {
    private int age;
    /* When a variable is declared static, it means it belongs to the object itself not to
     * only its instances; hence can be manipulated throught the object not only its instances */
    public static String orgName;
    public static String orgEmail;
    private double salary;

    /* Because static variables do not belong the instances, there is no need to include it
     * in the construct */
    public Employee(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public static void getDetails() {
        System.out.println("Org name :: " + getOrgName());
        System.out.println("Org email :: " + getOrgEmail() + "\n");

        /* non-static variables cannot be used in static methods/inner-classes */
//        System.out.println("Employee age :: " + getAge());
//        System.out.println("Employee salary :: " + getSalary());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* Static variables can have getters and setters */
    public static String getOrgName() {
        return orgName;
    }

    public static void setOrgName(String orgName) {
        Employee.orgName = orgName;
    }

    public static String getOrgEmail() {
        return orgEmail;
    }

    public static void setOrgEmail(String orgEmail) {
        Employee.orgEmail = orgEmail;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
