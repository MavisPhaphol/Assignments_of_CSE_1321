//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 1C
import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner dc = new Scanner(System.in);
        //Input
        System.out.print("Enter the day (number): ");
        Integer day = sc.nextInt();
        System.out.print("Enter the month (number): ");
        Integer month = sc.nextInt();
        System.out.print("Enter the month (string): ");
        String month2 = dc.nextLine();
        System.out.print("Enter the year (number): ");
        Integer year = sc.nextInt();
        //Output
        System.out.println("Here are some ways to represent the date: ");
        System.out.println(month + "/" + day + "/" + year + "\n" +  year + "/" + day + "/" + month +"\n" +
                day + "/" + month + "/" + year + "\n" + month2 + " " + day + "," + " " + year + "\n" + day +
                " " + month2 + " " + year);

    }
}
