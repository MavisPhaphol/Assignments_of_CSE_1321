//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 3A
import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Cretaceous Park GIS]");
        //Input
        System.out.print("X Coordinate: ");
        float xCord = sc.nextFloat();
        System.out.print("Y Coordinate: ");
        float yCord = sc.nextFloat();
        //Statements
        if ((xCord<=8)&&(yCord<=8)){
            if ((xCord>=2)&&(xCord<=4)&&(yCord>=2)&&(yCord<=6)){
                System.out.println("You are at the T. Rex Lake");
            }
            else if ((xCord>=5)&&(yCord>=0)&&(yCord<=2)){
                System.out.println("You are at the Pterodactyl Aviary");
            }
            else if ((xCord>=6)&&(yCord>=2)&&(yCord<=4)){
                System.out.println("You are at the Visitor's Center");
            }
            else if ((xCord>=5)&&(yCord>=5)){
                System.out.println("You are at the Deinonychus Pen");
            }
            else {
                System.out.println("You are at the Triceratops Grasslands"); 
            }
        }
        else {
            System.out.println("WARNING: You have left the boundaries of the park.");
            System.out.println("Please return immediately.");
        }
    }
}
