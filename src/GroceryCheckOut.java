//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 1B
import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        Scanner integer = new Scanner(System.in);
        Scanner flo = new Scanner(System.in);
        //First Grocery Item
        System.out.print("What are you buying? ");
        String groceryName = string.nextLine();
        System.out.print("How many? ");
        Integer quantity = integer.nextInt();
        System.out.print("What do they cost? ");
        Float price = flo.nextFloat();
        //Second Grocery Item
        Scanner string2 = new Scanner(System.in);
        Scanner integer2 = new Scanner(System.in);
        Scanner flo2 = new Scanner(System.in);
        System.out.print("What else are you buying? ");
        String groceryName2 = string2.nextLine();
        System.out.print("How many? ");
        Integer quantity2 = integer2.nextInt();
        System.out.print("What do they cost? ");
        Float price2 = flo2.nextFloat();

        //Calculation
        Float total = price * quantity;
        Float total2 = price2 * quantity2;
        Float altogether = total + total2;
        //Output
        System.out.println("Your List: ");
        System.out.println("____");
        System.out.println(groceryName + "(" + quantity + ")\n"+ "$" + price + "($" + total + " total)\n\n" +
                groceryName2 + "(" + quantity2 + ")\n" + "$" + price2 + "($" + total2 + " total)\n Total Cost" +
                ": $" + altogether + "\n ____");
    }
}
