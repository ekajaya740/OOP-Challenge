package id.ekajaya740.oopchallenge;

import id.ekajaya740.oopchallenge.Organs;

public class Eyes extends Organs {
    private String color;
    private final String colorStr = "Color: ";

    public Eyes(String name, String medicalCond, String color) {
        super(name, medicalCond);
        this.color = color;
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println(colorStr + color);
        System.out.println("\t\t1. Close the Eye");
    }

    public void eyeClosed(){
        System.out.println(getName() + " closed");
    }
}
