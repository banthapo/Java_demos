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


    private static void handleSkin() {
        Skin skin = new Skin(null, "Skin", "Black", false, false);
        skin.skinDetails();
        skin.options();

        int opt = getOption();
        if (opt <= 2)
            skin.handleOption(opt);

        if (opt == 6) return;
        options();

        int option = getOption();
        handlePatient(option);
    }

    private static void handleStomach() {
        Stomach stomach = new Stomach(null, "Stomach", false, null, 0);
        stomach.stomachDetails();
        stomach.options();

        int opt = getOption();
        if (opt == 1)
            stomach.handleOption(opt);

        if (opt == 6) return;
        options();

        int option = getOption();
        handlePatient(option);
    }


    private static void handleHeart() {
        Heart heart = new Heart("Blood Pressure", "Heart", 89);
        heart.heartDetails();
        heart.options();

        int opt = getOption();
        heart.handleOption(opt);

        if (opt == 6) return;
        options();

        int option = getOption();
        handlePatient(option);
    }

    public static void handleRightEye() {
        Eye rightEye = new Eye("Conjunctivitis", "Right eye", "blue");
        rightEye.eyeDetails();
        rightEye.options();

        int opt = getOption();
        rightEye.handleOption(opt, "Right");

        if (opt == 6) return;
        options();

        int option = getOption();
        handlePatient(option);
    }

    public static void handleLeftEye() {
        Eye leftEye = new Eye("Red eye", "Left eye", "black");
        leftEye.eyeDetails();
        leftEye.options();

        int opt = getOption();
        leftEye.handleOption(opt, "Left");

        if (opt == 6) return;
        options();

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
                handleHeart();
                break;
            }
            case 4: {
                handleStomach();
                break;
            }
            case 5: {
                handleSkin();
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
        System.out.println("    1. Left eye");
        System.out.println("    2. Right eye");
        System.out.println("    3. Heart");
        System.out.println("    4. Stomach");
        System.out.println("    5. Skin");
        System.out.println("    6. Quit");
        System.out.println("");
    }
}