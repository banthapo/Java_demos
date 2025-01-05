package keywords_innerClasses;

public class Main {
    public static void main(String[] args) {
        /* Ways of accessing static variables
         * first */
        Employee.orgEmail = "mandevu@gmail.org";
        System.out.println("Direct assignment and retrieval :: " + Employee.getOrgEmail());

        /* second */
        Employee.setOrgEmail("kalulu@gmail.org");
        System.out.println("Set and get email :: " + Employee.getOrgEmail());

        /* third */
        String email = Employee.getOrgEmail();
        System.out.println("get email :: " + email);

        Employee emp = new Employee(17, 20000.89);

        /* fourth */
        emp.setOrgName("Nunkha-dala");
        String name = emp.getOrgName();
        System.out.println("get org name :: " + name + "\n");


        /* Accessing static method */
        Employee.getDetails();

        /* Accessing static inner classes */
        StaticClasses.secondClass secClass = new StaticClasses.secondClass("Second Class");
        System.out.println("Inner class name :: " + secClass.getName() );

        /* Accessing non-static inner classes */
        StaticClasses first = new StaticClasses();
        StaticClasses.firstClass firstClass = first.new firstClass("First class");
        System.out.println("First inner class name :: " + firstClass.getName());
    }
}
