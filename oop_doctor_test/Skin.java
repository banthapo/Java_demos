package oop_doctor_test;

import java.util.Scanner;

public class Skin extends Diagnosis {

    private String color;
    private boolean healing;
    private boolean affected;

    public Skin(String illness, String organName, String color, boolean healing, boolean affected) {
        super(illness, organName);
        this.color = color;
        this.healing = healing;
        this.affected = affected;
    }

    public void skinDetails() {
        System.out.println("Name :: " + getOrganName());
        if (affected)
            System.out.println("Medical Condition :: " + getIllness());
        else
            System.out.println("Medical Condition :: Normal");

        System.out.println("Color :: " + getColor());

        if (healing)
            System.out.println("Affected :: " + isAffected());

        if (healing)
            System.out.println("Healing :: " + isHealing());
    }

    public void options() {
        System.out.println("    1. Affect skin");
        System.out.println("    2. Heal skin");
        System.out.println("    3. return");
        System.out.println("");

    }

    public void infectionList() {
        System.out.println("    1. Elephant pox]=");
        System.out.println("    2. Monkey pox");
        System.out.println("    3  Chicken pox");
        System.out.println("    4. Eczema");
        System.out.println("");

    }

    public void handleOption(int opt) {
        switch (opt) {
            case 1: {
                setAffected(true);
                initiateInfection();
                break;
            }
            case 2: {
                System.out.println("Healing skin...");
                setHealing(true);
                setAffected(false);
                setIllness("Normal");

                System.out.println("");
                skinDetails();
                System.out.println("");

            }
            case 3: {
                setAffected(false);
                break;
            }
            default: {
                System.out.println("No such option available.");
                break;
            }
        }
    }

    private void initiateInfection() {
        setHealing(false);
        selectInfection();
    }

    private void selectInfection() {
        infectionList();
        int opt = getOption();

        switch (opt) {
            case 1 -> {
                setIllness("Elephant pox");
                setAffected(true);
            }
            case 2 -> {
                setIllness("Monkey pox");
                setAffected(true);
            }
            case 3 -> {
                setIllness("Chicken pox");
                setAffected(true);
            }
            case 4 -> {
                setIllness("Eczema");
                setAffected(true);
            }
            default -> {
                setAffected(false);
                setIllness("Normal");
            }
        }
        System.out.println("Skin status...");
        System.out.println("");
        skinDetails();
        System.out.println("");

    }

    public int getOption() {
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();
        return opt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHealing() {
        return healing;
    }

    public void setHealing(boolean healing) {
        this.healing = healing;
    }

    public boolean isAffected() {
        return affected;
    }

    public void setAffected(boolean affected) {
        this.affected = affected;
    }
}
