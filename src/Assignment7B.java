//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 7B
import java.util.Scanner;
class Pixel{
    int red;
    int green;
    int blue;
    public Pixel[][] array;
    Pixel(){
        red=255;
        green=255;
        blue=255;
    }
    public void setArray(Pixel[][] array) {
        this.array = array;
    }

    public void setRed(int red) {
        this.red = red;
    }
    public void setGreen(int green) {
        this.green = green;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }
    public void changeRGB(int newRed, int newGreen, int newBlue){
        red=newRed;
        green=newGreen;
        blue=newBlue;
    }
    public void printRGB(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int x = 0; x < width; x++) {
                System.out.print(red + " " + green + " " + blue+" ");
            }
            System.out.println();
        }
    }
}
public class Assignment7B {
    public static void main(String[]args){
        Pixel set= new Pixel();
        Scanner sc=new Scanner(System.in);
        System.out.println("[Color Art Program]");
        //width height into array
        System.out.print("Enter an image width: ");
        int width=sc.nextInt();
        System.out.print("Enter an image height: ");
        int height= sc.nextInt();
        Pixel[][] array = new Pixel[width][height];
        System.out.print("Enter the fill color's red value: ");
        int red= sc.nextInt();
        set.setRed(red);
        System.out.print("Enter the fill color's green value: ");
        int green= sc.nextInt();
        set.setGreen(green);
        System.out.print("Enter the fill color's blue value: ");
        int blue= sc.nextInt();
        set.setBlue(blue);
        int userChoice=0;
        while(userChoice!=4) {
            System.out.println("What will you do?\n1) Fill in a pixel\n2) Fill in a line\n3) Print the image\n4) Quit");
            System.out.print("Choice? ");
            userChoice= sc.nextInt();
            if (userChoice == 1) { //fill in pixel
                System.out.print("Row: ");
                int row = sc.nextInt();
                System.out.print("Column: ");
                int col= sc.nextInt();
                Pixel[][] pixel=new Pixel[row][col];
                System.out.print("New Red color: ");
                int newRed=sc.nextInt();
                System.out.print("New Green color: ");
                int newGreen=sc.nextInt();
                System.out.print("New Blue color: ");
                int newBlue=sc.nextInt();
                set.changeRGB(newRed,newGreen,newBlue);
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        set.setRed(red);
                        set.setGreen(green);
                        set.setBlue(blue);
                        if (width==row&&height==col){
                            array[i][j].changeRGB(newRed,newGreen,newBlue);
                        }
                        set.setArray(array);
                    }
                }
            } else if (userChoice == 2) { //fill in line
                System.out.print("Row: ");
                int row = sc.nextInt();
                System.out.print("Column: ");
                int col= sc.nextInt();
                System.out.print("New Red color: ");
                int newRed=sc.nextInt();
                System.out.print("New Green color: ");
                int newGreen=sc.nextInt();
                System.out.print("New Blue color: ");
                int newBlue=sc.nextInt();
                System.out.print("Length: ");
                int length = sc.nextInt();
                System.out.print("Direction: ");
                String direction = sc.next();
                int counter=0;
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) {
                        if (width == row && height == col) {
                            while (counter <= length) {
                                if (direction.equalsIgnoreCase("up")) {
                                    j+=1;
                                    array[i][j].changeRGB(newRed, newGreen, newBlue);
                                    counter++;
                                    set.setArray(array);
                                }
                                else if (direction.equalsIgnoreCase("down")){
                                    j-=1;
                                    array[i][j].changeRGB(newRed, newGreen, newBlue);
                                    counter++;
                                    set.setArray(array);
                                }
                                else if (direction.equalsIgnoreCase("right")){
                                    i+=1;
                                    array[i][j].changeRGB(newRed, newGreen, newBlue);
                                    counter++;
                                    set.setArray(array);
                                }
                                else if (direction.equalsIgnoreCase("left")){
                                    i-=1;
                                    array[i][j].changeRGB(newRed, newGreen, newBlue);
                                    counter++;
                                    set.setArray(array);
                                }
                            }
                        }
                    }
                }
            } else if (userChoice == 3) { //print image
                System.out.println("PPM Image Contents\nP3");
                System.out.println(width + " " + height + "\n255");
                set.printRGB(width,height);
            }
        }
    }
}
