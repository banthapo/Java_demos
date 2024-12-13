
import java.util.*;

class Demo {

    public static void main(String[] args) {
        System.out.println("Welcome to this wonderful GAME.");
        System.err.println("");

        int num = (int) (Math.random() * 20);
        System.out.println("random num :: " + num);

        int i = 0;

        String name = getName();
        char opt = getOpt(name, i);

        checkOpt(opt, num, name, i);

    }

    public static String getName() {
        System.out.println("Please enter your name.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        return name;
    }

    public static char getOpt(String name, int i) {
        if (i == 0)
            System.out.println(name + " do you wish to start the Game? (y/n)");
        else
            System.out.println("Make sure your input is of correct type.");

        Scanner scanner = new Scanner(System.in);
        char opt = scanner.next().charAt(0);

        return opt;
    }

    public static int getGuess(int i) {
        if (i == 0) {
            System.out.println("Let the game begin... ");
            System.out.println("");

        } else {
            System.out.println("guess again...");
            System.out.println("");

        }
        System.out.println("Please enter your guessed answer (range: 0 - 19).");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        return answer;
    }

    public static boolean checkOpt(char opt, int num, String name, int i) {
        switch (opt) {
            case 'y', 'Y' -> {
                start(num, i, name);
                i++;
                return true;
            }
            case 'n', 'N' -> {
                System.out.println("See you next time.");
                System.out.println("");
                return false;
            }
            default -> {
                System.out.println("Invalid Input!");
                System.out.println("");

                char op = getOpt(name, i);
                nextTrial(op, i, num, name);
                i++;
                return false;
            }
        }
    }

    public static void start(int num, int i, String name) {

        System.out.println("");

        int guess = getGuess(i);

        if (guess == num && i != 5) {
            i++;
            System.out.println("Correct!!!");
            System.out.println("");

        } else if (i == 5) {
            System.out.println("Game over!!!");
            System.out.println("Correct answer :: " + num);

        } else {
            i++;
            System.out.println("Wrong!!!");
            System.out.println("");

            System.out.println("Wanna try again? (y/n)");
            char choice = retryOpt();

            if (choice == 'Y' || choice == 'y') {
                nextTrial(choice, i, num, name);

            } else {
                System.out.println("Correct answer :: " + num);
                System.out.println("");
                System.out.println("See you next time.");

            }
        }

    }

    public static void nextTrial(char choice, int trial, int num, String name) {
        int guess = getGuess(trial);

        if (checkOpt(choice, num, name, trial) && trial < 4) {
            switch (choice) {
                case 'y', 'Y' -> {
                    trial++;
                    System.out.println("You have tried " + trial + " time.");
                    System.out.println("");
                    if (trial < 5 && guess != num)
                        retry(num, trial, name, guess);
                    break;
                }
                case 'n', 'N' -> {
                    System.out.println("Correct answer :: " + num);
                    System.out.println("");

                    System.out.println("See you next time.");
                    System.out.println("");
                    break;
                }
                default -> {
                    System.out.println("Invalid Input!");
                    System.out.println("");
                    retry(num, trial, name, guess);
                    trial++;
                    break;

                }
            }
        }

    }

    public static void retry(int num, int i, String name, int guess) {

        if (guess == num && i < 5) {
            System.out.println("Correct!!!");
            System.out.println("");

        } else if (i == 5) {
            System.out.println("Game over!!!");
            System.out.println("");

        } else {
            System.out.println("Wrong!!!");
            System.out.println("");
            System.out.println("Wanna try again? (y/n)");
            System.out.println("");

            char choice = retryOpt();
            nextTrial(choice, i, num, name);
            i++;

        }

    }

    public static char retryOpt() {
        Scanner scanner = new Scanner(System.in);
        char opt = scanner.next().charAt(0);
        return opt;
    }

}
