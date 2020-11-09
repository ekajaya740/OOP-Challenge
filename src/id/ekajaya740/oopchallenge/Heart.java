package id.ekajaya740.oopchallenge;

public class Heart extends Organs{
    int heartRate;
    private final String heartRateStr = "Heart Rate: ";

    public Heart(String name, String medicalCond, int heartRate) {
        super(name, medicalCond);
        this.heartRate = heartRate;
    }

    @Override
    public void showStats() {
        super.showStats();
        System.out.println(heartRateStr + heartRate);
        System.out.println("\t\t1. Change the heart rate");
    }

    public void changeHeartRate(){
        System.out.println("Heart rate changed to: " + heartRate);
    }
}
