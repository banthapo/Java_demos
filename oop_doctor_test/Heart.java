package oop_doctor_test;

import java.util.Scanner;

public class Heart extends Diagnosis {
    private int rate;

    public Heart(String illness, String name, int rate) {
        super(illness, name);
        this.rate = rate;
    }

    public void eyeDetails() {
        System.out.println("Name :: " + getOrganName());
        System.out.println("Medical Condition :: " + getIllness());
        System.out.println("Heartbeat Rate :: " + rate);
    }

    public void options() {
        System.out.println("    1. Close the eye");
        System.out.println("    2. Remove the eye");
        System.out.println("");

    }

    public int getOption() {
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();
        return opt;
    }

    public void handleOption(int opt, String side) {
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
        rate += 10;
        System.out.println("Rate is now :: " + rate + " previously " + (rate - 10));
        System.out.println("");

    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
