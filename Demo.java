
import java.util.*;

class Demo {

    public static void main(String[] args) {
        System.out.println("Welcome to this wonderful GAME.");
        System.err.println("");

        String name = getName();
        char opt = getOpt(name);
        checkOpt(opt);

        System.out.println(name + " option: " + opt + " random num :: " + Math.random());
    }

    public static String getName() {
        System.out.println("Please enter your name.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        return name;
    }

    public static char getOpt(String name) {
        System.out.println(name + " do you wish to start the Game? (y/n)");

        Scanner scanner = new Scanner(System.in);
        char opt = scanner.next().charAt(0);

        return opt;
    }

    public static int getGuess() {
        System.out.println("Please enter your guessed answer (range: 0 - 19).");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        return answer;
    }

    public static void start(int num) {
        int guess = getGuess();

        for (int i = 0; i <= 5; i++) {
            if (guess == num && i != 5) {
                System.out.println("Correct!!!");
                System.out.println("");
                System.out.println("Wanna try again? (y/n)");

            } else if (i == 5) {
                System.out.println("Game over!!!");
            } else {
                System.out.println("Wrong!!!");
                System.out.println("");
                System.out.println("Wanna try again? (y/n)");
            }
        }
    }

    public static void checkOpt(char opt) {
        int num = (int) Math.random() * 20;
        switch (opt) {
            case 'y', 'Y' -> {
                System.out.println("Let the game begin... " + num);
                start(num);
                break;
            }
            case 'n', 'N' -> {
                System.out.println("See you next time.");
            }
            default -> {
                System.out.println("Invalid Input!");
            }
        }
    }

}
