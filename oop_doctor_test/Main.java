package oop_doctor_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Leonard", 46, true);

        Eye eye = new Eye("Red eye", "Left eye", "black");

        patient.patientData();
        options();
        int option = getOption();
        handlePatient(option);
    }

    private static void handleSkinEye() {
    }

    private static void handleStomachEye() {

    }

    private static void handleHeartEye() {

    }

    public static void handleRightEye() {
        Eye rightEye = new Eye("Conjunctivitis", "Right eye", "blue");
        rightEye.eyeDetails();
        rightEye.options();

        int opt = rightEye.getOption();
        rightEye.handleOption(opt,"Right");
        options();

        if (opt == 6) return;

//        options();
        int option = getOption();
        handlePatient(option);
    }

    public static void handleLeftEye() {
        Eye leftEye = new Eye("Red eye", "Left eye", "black");
        leftEye.eyeDetails();
        leftEye.options();

        int opt = leftEye.getOption();
        leftEye.handleOption(opt,"Left");
        options();

        if (opt == 6) return;

        int option = getOption();
        handlePatient(option);
    }

    public static void handlePatient(int opt) {


        switch (opt) {
            case 1: {
                handleLeftEye();
                break;
            }
            case 2: {
                handleRightEye();
                break;
            }
            case 3: {
                handleHeartEye();
                break;
            }
            case 4: {
                handleStomachEye();
                break;
            }
            case 5: {
                handleSkinEye();
                break;
            }
            default: {
                break;
            }
        }
    }

    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();
        return opt;
    }

    public static void options() {
        System.out.println("Choose an organ:");
        System.out.println("    1. Left Diagnosis");
        System.out.println("    2. Right Diagnosis");
        System.out.println("    3. Heart");
        System.out.println("    4. Stomach");
        System.out.println("    5. Skin");
        System.out.println("    6. Quit");
        System.out.println("");
    }
}