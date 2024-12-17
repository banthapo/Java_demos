package oop_doctor_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Leonard", 46, true);

        patient.patientData();
        options();
    }

    public int getOption(){
        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();
        return opt;
    }
    public static void options(){
        System.out.println("Choose an organ:");
        System.out.println("    1. Left Eye");
        System.out.println("    2. Right Eye");
        System.out.println("    3. Heart");
        System.out.println("    4. Stomach");
        System.out.println("    5. Skin");
        System.out.println("    6. Quit");
        System.out.println("");
    }
}