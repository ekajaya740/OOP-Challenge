package id.ekajaya740.oopchallenge;

public class Stomach extends Organs {
    private final String needFed = "Need to be fed";

    public Stomach(String name, String medicalCond) {
        super(name, medicalCond);
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println(needFed);
        System.out.println("\t\t1. Digest");
    }

    public void disgest(){
        System.out.println("Digesting begin");
    }
}
