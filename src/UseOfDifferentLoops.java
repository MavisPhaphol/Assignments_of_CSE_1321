//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 4A
import java.util.Scanner;
public class Assignment4A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Presenting choices vv
        System.out.println("What loop do you want to use?");
        System.out.println("1) A loop might run zero or more times"); /*While loop*/
        System.out.println("2) A loop that will always run at least once"); /*Do While loop*/
        System.out.println("3) A loop with a predetermined start and end"); /*For loop*/
        //User Choice vv
        System.out.print("Your choice: ");
        int userChoice = sc.nextInt();
        //Statements
        if (userChoice==1){
            System.out.print("What's your starting number? ");
            int startNum = sc.nextInt();
            System.out.print("Counting: ");
            while (startNum>=0){
                System.out.print(startNum+",");
                startNum= startNum -1;
            }
        }
        else if (userChoice==2){
            System.out.print("What's your starting number? ");
            int startNum = sc.nextInt();
            System.out.print("Counting: ");
            do{
                System.out.print(startNum+",");
                startNum = startNum - 1;
            } while (startNum>=0);
        }
        else if (userChoice==3){
            System.out.print("What's your starting number? ");
            int startNum = sc.nextInt();
            System.out.print("What's your end number? ");
            int endNum = sc.nextInt();
            System.out.print("Counting: ");
            for (int starting = startNum; starting>=endNum; starting--){
                System.out.print(starting+",");
            }
        }
    }
}
