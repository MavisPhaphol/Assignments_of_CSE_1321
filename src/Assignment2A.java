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
        Integer firstNumber = calc.nextInt();
        System.out.print("Second Number: ");
        Integer secondNumber = calc.nextInt();
        System.out.print("Number for Modulo Operation: ");
        Integer modulo = calc.nextInt();

        //Calculation
        Integer sum = firstNumber + secondNumber;
        Integer diff = firstNumber - secondNumber;
        Integer product = firstNumber * secondNumber;
        Integer quotient = firstNumber / secondNumber;
        Integer moduSum = sum % modulo;
        Integer moduDiff = diff % modulo;
        Integer moduPro = product % modulo;
        Integer moduQuot = quotient % modulo;


        //Output
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum + ". The remainder is " + moduSum + ".\n"
        + firstNumber + " - " + secondNumber + " = " + diff +". The remainder is " + moduDiff + ". \n" + firstNumber
        + " * " + secondNumber + " = " + product + ". The remainder is " + moduPro + ". \n" + firstNumber + "/" + secondNumber
        + " = " + quotient + " (Approximately). The remainder if divided by 5 is " + moduQuot + ".");
    }
}