//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 1A
import java.awt.image.ColorConvertOp;
import java.util.Scanner;
public class Assignment1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User's Input
        System.out.print("Enter a red value (0-255) : ");
        int red = sc.nextInt();
        System.out.print("Enter a green value (0-255) : ");
        int green = sc.nextInt();
        System.out.print("Enter a blue value (0-255) : ");
        int blue = sc.nextInt();

        //Inverted Color Calculation
        int invertedRed = 255 - red;
        int invertedGreen = 255 - green;
        int invertedBlue = 255 + blue;

        //Converting inverted color int to float
        float redFloat = (float) red / 255;
        float greenFloat = (float) invertedGreen / 255 ;
        float blueFloat = (float) invertedBlue / 255;

        //Output
        System.out.println("The inverted color is red=" + invertedRed + ", green=" + invertedGreen + ", blue=" +
                invertedBlue + ".");
        System.out.println("With floating points, that would be red=" + redFloat + ", green=" + greenFloat +
                ", blue=" + blueFloat);
    }
}
