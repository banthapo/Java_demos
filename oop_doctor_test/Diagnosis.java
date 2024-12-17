package oop_doctor_test;

public class Diagnosis {

    private String illness;
    private String organName;

    public Diagnosis(String illness, String organName) {
        this.illness = illness;
        this.organName = organName;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }
    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

}
