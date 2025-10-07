//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 6C
import java.util.Scanner;
public class Assignment6C {
    public static int surprise_function(int valueOne,int valueTwo){
        int sum=valueOne+valueTwo;
        return sum;
    }
    public static float surprise_function(float valueOne,float valueTwo){
        float quotient=(valueOne/valueTwo);
        return quotient;
    }
    public static double surprise_function(double valueOne,double valueTwo){
        double modulus=(valueOne%valueTwo);
        return modulus;
    }
    public static String surprise_function(char valueOne,char valueTwo){
        String word=(""+valueOne+valueTwo);
        return word;
    }
    public static boolean surprise_function(boolean valueOne,boolean valueTwo){
        boolean isValid=valueOne&&valueTwo;
        return isValid;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[Overloaded Surprise Function]");
        System.out.print("What data type do you want to enter? ");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase("Integer")){
            System.out.print("Value #1: ");
            int valueOne= sc.nextInt();
            System.out.print("Value #2: ");
            int valueTwo= sc.nextInt();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+ surprise_function(valueOne,valueTwo));
        }
        else if(type.equalsIgnoreCase("Float")){
            System.out.print("Value #1: ");
            float valueOne= sc.nextFloat();
            System.out.print("Value #2: ");
            float valueTwo= sc.nextFloat();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+ surprise_function(valueOne,valueTwo));
        }
        else if(type.equalsIgnoreCase("Double")){
            System.out.print("Value #1: ");
            double valueOne= sc.nextDouble();
            System.out.print("Value #2: ");
            double valueTwo= sc.nextDouble();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+ surprise_function(valueOne,valueTwo));
        }
        else if(type.equalsIgnoreCase("Char")){
            System.out.print("Value #1: ");
            char valueOne= sc.next().charAt(0);
            System.out.print("Value #2: ");
            char valueTwo= sc.next().charAt(0);
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+ surprise_function(valueOne,valueTwo));
        }
        else if(type.equalsIgnoreCase("Boolean")){
            System.out.print("Value #1: ");
            boolean valueOne= sc.nextBoolean();
            System.out.print("Value #2: ");
            boolean valueTwo= sc.nextBoolean();
            System.out.println("Calling surprise_function()...");
            System.out.println("The result is "+ surprise_function(valueOne,valueTwo));
        }
    }
}
