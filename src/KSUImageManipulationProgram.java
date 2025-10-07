import java.util.Arrays;
import java.util.Scanner;

//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 5B
public class Assignment5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[KSU Image Manipulation Program]");
        System.out.print("Enter an image width: ");
        int width = sc.nextInt();
        System.out.print("Enter an image height: ");
        int height = sc.nextInt();
        System.out.print("Enter the fill color: ");
        int fillColor = sc.nextInt();
        int maxColor = 255;
        int userChoice = 0;
        int counter= height;
        //the 2D array
        int[][] image = new int[height][width];
        while (userChoice != 4) {
            System.out.println("What will you do?\n1) Fill in a pixel\n2) Fill in a line\n3) Print the image\n4) Quit");
            System.out.print("Choice? ");
            userChoice = sc.nextInt();
            int count = 1;
            if (userChoice == 1) {//fill in a pixel
                System.out.println("PGM Image Contents\nP2\n" + width + " " + height + "\n" + maxColor);
                System.out.print("Row: ");
                int row = sc.nextInt();
                System.out.print("Column: ");
                int col = sc.nextInt();
                System.out.print("New Color: ");
                int newColor = sc.nextInt();
                if (row > width || col > height || newColor > maxColor) {
                    System.out.println("Invalid information!");
                    System.out.print("Row: ");
                    row = sc.nextInt();
                    System.out.print("Column: ");
                    col = sc.nextInt();
                    System.out.print("New Color: ");
                    newColor = sc.nextInt();
                    }
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        image[i][j] = fillColor;
                        if (height==row&&width==col){
                            image[height][width]=newColor;
                        }
                    }
                }
                } else if (userChoice == 2) {
                    System.out.println("PGM Image Contents\nP2\n" + width + " " + height + "\n" + maxColor);
                    System.out.print("Row: ");
                    int userRow = sc.nextInt();
                    System.out.print("Column: ");
                    int userCol = sc.nextInt();
                    System.out.print("New Color: ");
                    int userNewColor = sc.nextInt();
                    System.out.print("Length: ");
                    int length = sc.nextInt();
                    System.out.print("Direction: ");
                    String direction = sc.next();
                if (userRow > width || userCol > height || userNewColor > maxColor) {
                    System.out.println("Invalid information!");
                    System.out.print("Row: ");
                    userRow = sc.nextInt();
                    System.out.print("Column: ");
                    userCol = sc.nextInt();
                    System.out.print("New Color: ");
                    userNewColor = sc.nextInt();
                    continue;
                }
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        image[i][j] = fillColor;
                        if (height == userRow && width == userCol) {
                            while (counter <= length) {
                                image[height][width] = userNewColor;
                                if (direction=="up"){
                                    if(height<=userRow){
                                        image[height][width]=userNewColor;
                                        counter++;
                                    }
                                }
                                else if (direction=="down"){
                                    if(height>=userRow){
                                        image[height][width]=userNewColor;
                                        counter++;
                                    }
                                }
                                else if (direction=="left"){
                                    if(width<=userCol){
                                        image[height][width]=userNewColor;
                                        counter++;
                                    }
                                }
                                else if (direction=="right"){
                                    if(width>=userCol){
                                        image[height][width]=userNewColor;
                                        counter++;
                                    }
                                }
                            }
                        }
                    }
                }
                } else if (userChoice == 3) {
                    System.out.println("PGM Image Contents\nP2\n" + width + " " + height + "\n" + maxColor);
                    for (int row = 0; row < height; row++) {
                        for (int col = 0; col < width; col++) {
                            System.out.print(image[row][col] + " ");
                        }
                        System.out.print("\n");
                    }
                }
            }
        System.out.println("[Exiting KSU Image Manipulation Program]");
        }
    }
