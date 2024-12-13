package classes_lesson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lonjezo chijuwa", "Liwonde Mawila 1", 88846666,
                'M');

        Car car = new Car("NB8989", "v8", "18 / 11 / 2024");

        System.out.println(person.fullDetails());
        System.out.println(car.fullDetails());

        // Car car = new Car();

    }
}
