package id.ekajaya740.oopchallenge;

import java.util.Scanner;


/**
 * TODO: Output OOP Challenge
 * Name: Tom
 * Age: 25
 * Choose Organ
 *      1. Left Eye
 *          Name: Left Eye
 *          Medical Condition: Short sighted
 *          Color: Blue
 *              1. Close the Eye
 *                  Left Eye closed
 *      2. Right Eye
 *          Name: Right Eye
 *          Medical Condition: Normal
 *          Color: Blue
 *              1. Close the Eye
 *  *                  Right Eye closed
 *      3. Heart
 *          Name: Heart
 *          Medical Condition: Normal
 *          Heart Rate: 65
 *              1. Change the heart rate
 *                  Enter the new heart rate: (INPUT)
 *                  Heart rate changed to: 75
 *      4. Stomach
 *          Name: Stomach
 *          Medical Condition: PUD
 *          Need to be fed
 *              1. Digest
 *                  Digesting begin
 *      5. Skin
 *          Name: Skin
 *          Medical Condition: Burned
 *          (GO TO MAIN MENU)
 *      6. Quit (Quit the simulation)
 *
 *      Repeat whenever not quited
 */

public class Main {
    public static void main(String[] args) {
        boolean isPlaying = true;
        Scanner scan = new Scanner(System.in);
        int scanReuser;

        Patient patient = new Patient();

        Eyes leftEye = new Eyes("Left Eye", "Short sighted", "Blue");
        Eyes rightEye = new Eyes("Right Eye", "Normal", "Blue");
        Heart heart = new Heart("Heart", "Normal", 65);
        Stomach stomach = new Stomach("Stomach", "PUD");
        Skin skin = new Skin("Skin", "Burned");

        String[] chooseOption = {"Left Eye", "Right Eye", "Heart", "Stomach", "Skin", "Quit"};

        System.out.println(patient.getName());
        System.out.println(patient.getAge());
        while(isPlaying){
            System.out.println("Choose an Organ:");
            for(int i = 0; i < chooseOption.length; i++){
                System.out.println("\t" + (i+1) + ". " + chooseOption[i]);
            }
            scanReuser = scan.nextInt();

            switch (scanReuser){
                case 1:
                    leftEye.showStats();
                    scanReuser = scan.nextInt();
                    switch (scanReuser){
                        case 1:
                            leftEye.eyeClosed();
                            break;
                    }
                    break;
                case 2:
                    rightEye.showStats();
                    scanReuser = scan.nextInt();
                    switch (scanReuser){
                        case 1:
                            rightEye.eyeClosed();
                            break;
                    }
                    break;
                case 3:
                    heart.showStats();
                    scanReuser = scan.nextInt();
                    switch (scanReuser){
                        case 1:
                            System.out.print("Enter the new heart rate: ");
                            scanReuser = scan.nextInt();
                            heart.heartRate = scanReuser;
                            heart.changeHeartRate();
                            break;
                    }
                    break;
                case 4:
                    stomach.showStats();
                    scanReuser = scan.nextInt();
                    switch (scanReuser){
                        case 1:
                            stomach.disgest();
                            break;
                    }
                    break;
                case 5:
                    skin.showStats();
                    break;
                case 6:
                    isPlaying = false;
                    break;
            }
        }
    }
}
