//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 2C
import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args) {
        Scanner distance = new Scanner(System.in);
        System.out.println("[Distance Calculator]");
        //Input
        System.out.print("How many meters? ");
        Float meter = distance.nextFloat();
        //Measurement
        Float moon = meter / 384317695 * 100;
        Float animal = meter * 40;
        //Output
        System.out.println(meter + " meter(s) is...\n ..." +
                String.format("%.8f", moon) + " distance from the Moon\n ... " + animal +
                " Animal Crackers long");
    }
}
