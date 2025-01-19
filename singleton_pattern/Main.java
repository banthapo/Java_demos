package singleton_pattern;

public class Main {
    public static void main(String[] args) {
        /* There is no need to create instances for static variables or functions */
        String database = Sample.getDatabase("DB_sample");

        /* constructor not accessible :: declared private */
        //        Sample sample = new Sample("db");  ❌

        System.out.println(database);
    }
}
