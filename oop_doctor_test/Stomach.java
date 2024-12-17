package oop_doctor_test;

import java.util.Scanner;

public class Stomach extends Diagnosis {
    boolean digesting;
    private String food;
    private float duration;

    public Stomach(String illness, String organName, boolean digesting, String food, float duration) {
        super(illness, organName);
        this.digesting = digesting;
        this.food = food;
        this.duration = duration;
    }

    public void stomachDetails() {
        System.out.println("Name :: " + getOrganName());
        if (getIllness() != null)
            System.out.println("Medical Condition :: " + getIllness());
        else
            System.out.println("Medical Condition :: Unknown");

        System.out.println("Digesting :: " + isDigesting());
        if (digesting)
            System.out.println("Food :: " + getFood());
        if (duration > 0)
            System.out.println("duration :: " + getDuration() + " seconds");

    }

    public void handleOption(int opt) {
        switch (opt) {
            case 1: {
                initiateDigestion();
                break;
            }
            case 2: {
                break;
            }
            default: {
                System.out.println("No such option available.");
                break;
            }
        }
    }

    public void options() {
        System.out.println("    1. Initiate digestion");
        System.out.println("    2. return");
        System.out.println("");

    }

    public String getString() {
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.next();
        return opt;
    }

    public String getStatus() {
        Scanner scanner = new Scanner(System.in);
        String status = scanner.next();
        return status;
    }

    private void handleDigestion() {
        float duration = (float) (Math.random() * 240 + 60);
        setDuration(duration);

        if (duration < 120) setIllness("Diarrhea");
        if (duration >= 120 && duration < 240) setIllness("Normal");
        if (duration >= 240) setIllness("Constipation");

        stomachDetails();
    }

    public void initiateDigestion() {
        System.out.println("Enter food eaten : ");
        String food = getString();
        setFood(food);

        System.out.println("Start digestion (y/n) : ");
        char state = getStatus().charAt(0);

        if (state == 'y' || state == 'Y') {
            System.out.println("Starting digestion...");
            System.out.println("");

            setDigesting(true);
            handleDigestion();
        } else if (state == 'n' || state == 'N') {
            System.out.println("Digestion suspended...");
            System.out.println("");

            setDigesting(false);
            stomachDetails();
        } else {
            System.out.println("Invalid input!");
            System.out.println("");

        }
    }

    public boolean isDigesting() {
        return digesting;
    }

    public void setDigesting(boolean digesting) {
        this.digesting = digesting;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
