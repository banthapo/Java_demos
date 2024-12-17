package oop_doctor_test;

import java.util.Scanner;

public class LeftEye {

    private String illness;
    private String color;

    public LeftEye(String illness, String color) {
        this.illness = illness;
        this.color = color;
    }

    public int getOption(){
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();
        return opt;
    }
    public void options(){
        System.out.println("    1. Close the eye");
        System.out.println("    2. Remove the eye");
        System.out.println("");

    }
    public void closeEye() {
        System.out.println("Left eye closed...");
        System.out.println("");

    }

    public void removeEye() {
        System.out.println("Left eye removed...");
        System.out.println("");

    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
