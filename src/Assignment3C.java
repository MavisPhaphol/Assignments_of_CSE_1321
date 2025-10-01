//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 3C
import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Cretaceous Park Dialog]");
        //Inputs
        System.out.println("Oh no, the power has gone out at Cretaceous Park!");
        System.out.println("1) What does that mean?");
        System.out.println("2) No, I just turned the light off.");
        String userInput = sc.nextLine();
        //Statements
        if (userInput.equals("What does that mean?")) {
            System.out.println("The dinosaurs will get loose... again...");
            System.out.println("1) Life finds a way...");
            System.out.println("2) What do we do?");
            String inputTwo = sc.nextLine();
            if (inputTwo.equals("Life finds a way...")){
                System.out.println("That's not helpful right now!");
                System.out.println("We have to evacuate the park!");
            }
            else {
                System.out.println("We have to evacuate the park!");
            }
        }
        else {
            System.out.println("Oh thank goodness!");
        }

    }
}
