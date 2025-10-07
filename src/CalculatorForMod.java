//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 2A
import java.util.Scanner;
public class Assignment2A {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        //Input
        System.out.print("First Number: ");
        int firstNumber = calc.nextInt();
        System.out.print("Second Number: ");
        int secondNumber = calc.nextInt();
        System.out.print("Number for Modulo Operation: ");
        int modulo = calc.nextInt();

        //Calculation
        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int moduSum = sum % modulo;
        int moduDiff = diff % modulo;
        int moduPro = product % modulo;
        int moduQuot = quotient % modulo;


        //Output
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum + ". The remainder is " + moduSum + ".\n"
        + firstNumber + " - " + secondNumber + " = " + diff +". The remainder is " + moduDiff + ". \n" + firstNumber
        + " * " + secondNumber + " = " + product + ". The remainder is " + moduPro + ". \n" + firstNumber + "/" + secondNumber
        + " = " + quotient + " (Approximately). The remainder if divided by 5 is " + moduQuot + ".");
    }
}
