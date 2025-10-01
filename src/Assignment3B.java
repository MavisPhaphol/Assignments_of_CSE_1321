//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 3B
import java.util.Scanner;
public class Assignment3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Image Encoding Checker]");
        //Input
        System.out.print("What is the image width? ");
        int width = sc.nextInt();
        System.out.print("What is the image height? ");
        int height = sc.nextInt();
        System.out.print("What is the file size (in bytes)? ");
        int size = sc.nextInt();
        //Calculation
        int bpc = size / width / height;
        //Statements
        if (bpc >=3){
            switch (bpc) {
                case 3:
                    System.out.println("The RGB image is encoded with 8 bits per channel.");
                    break;
                case 6:
                    System.out.println("The RGB image is encoded with 16 bits per channel.");
                    break;
                case 9:
                    System.out.println("The RGB image is encoded with 32 bits per channel.");
                    break;
                default:
                    System.out.println("Not familiar with this set of numbers");
                    break;
            }

        }
        else {
            System.out.println("The information is invalid - please re-enter it.");
        }
    }
}
