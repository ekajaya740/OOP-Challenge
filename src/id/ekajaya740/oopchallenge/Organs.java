package id.ekajaya740.oopchallenge;

public class Organs extends Patient {
    private String name;
    private String medicalCond;
    private final String nameStr = "Name: ";
    private final String medCondStr = "Medical Condition: ";

    public Organs(String name, String medicalCond) {
        this.name = name;
        this.medicalCond = medicalCond;
    }

    public void showStats(){
        System.out.println(this.nameStr + this.name);
        System.out.println(this.medCondStr + this.medicalCond);
    }

    public String getName() {
        return name;
    }
}
