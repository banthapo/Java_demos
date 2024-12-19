package oop_doctor_test;

import java.util.Scanner;

public class Heart extends Diagnosis {
    private int rate;

    public Heart(String illness, String name, int rate) {
        super(illness, name);
        this.rate = rate;
    }

    public void heartDetails() {
        System.out.println("Name :: " + getOrganName());
        System.out.println("Medical Condition :: " + getIllness());
        System.out.println("Heartbeat Rate :: " + getRate());

    }

    public void options() {
        System.out.println("    1. Stop heart");
        System.out.println("    2. Remove heart");
        System.out.println("    3. Increase heart rate");
        System.out.println("    4. Change heart rate");
        System.out.println("");

    }

    public int getOption() {
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();
        return opt;
    }

    public void handleOption(int opt) {
        switch (opt) {
            case 1: {
                stopHeart();
                break;
            }
            case 2: {
                removeHeart();
                break;
            }
            case 3: {
                increaseRate();
                break;
            }
            case 4: {
                changeRate();
                break;
            }
            default: {
                System.out.println("No such option available.");
                break;
            }
        }
    }

    public void stopHeart() {
        System.out.println("Heart successfully stopped...");
        System.out.println("");

    }

    public void removeHeart() {
        System.out.println("Heart successfully removed...");
        System.out.println("");
    }

    public void increaseRate() {
        setRate(getRate() + 10);
        System.out.println("Rate is now :: " + rate + " previously " + (rate - 10));
        System.out.println("");

    }

    public void changeRate() {
        System.out.println("Enter heart rate value : ");
        Scanner scanner = new Scanner(System.in);
        int rate = scanner.nextInt();
        setRate(rate);

        System.out.println("Rate is now :: " + getRate());
        System.out.println("");

    }


    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
