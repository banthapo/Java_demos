package oop_doctor_test;

import java.util.Scanner;

public class Eye extends Diagnosis {
    private String color;

    public Eye(String illness, String name, String color) {
        super(illness, name);
        this.color = color;
    }

    public void eyeDetails() {
        System.out.println("Name :: " + getOrganName());
        System.out.println("Medical Condition :: " + getIllness());
        System.out.println("Color :: " + color);
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
                closeEye(side);
                break;
            }
            case 2: {
                removeEye(side);
                break;
            }
            default: {
                System.out.println("No such option available.");
                break;
            }
        }
    }

    public void closeEye(String side) {
        System.out.println(side +" eye closed...");
        System.out.println("");

    }

    public void removeEye(String side) {
        System.out.println(side + " eye removed...");
        System.out.println("");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
