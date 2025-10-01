//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 2B
import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args) {
        Scanner video = new Scanner(System.in);
        Scanner speed = new Scanner(System.in);
        System.out.println("[Fast-Forward]");
        //Input
        System.out.print("What is the original video time? ");
        float videoTime = video.nextFloat();
        System.out.print("What is the playback speed factor? ");
        float playBack = speed.nextFloat();
        //Calculation (Gotten help from one of the TA's during the lab session)
        float min = (int) videoTime;
        float sec = min * 60;
        float newTime = sec / playBack;
        float timeSaved = sec - newTime;
        //Output
        System.out.println("The new video time would be " + String.format("%.3f", newTime) + " second(s).\n That saves you " +
                String.format("%.3f", timeSaved) + " second(s) from the " + "original video speed.");
    }
}
