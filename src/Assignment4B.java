//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 4B
import java.util.Scanner;
public class Assignment4B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Series of User's input
        int squareSize = 0;
        int borderSize = 0;
        int squareColor = -1;
        int borderColor = -1;
        do{ /*Square Size*/
            System.out.print("Enter the size of the square: ");
            int sizeSquare = sc.nextInt();
            squareSize = sizeSquare;
            if (squareSize<0){
                System.out.println("Invalid input!");
            }
        } while (squareSize<0);
        do{ /*Border Size*/
            System.out.print("Enter the size of the border: ");
            int sizeBorder = sc.nextInt();
            borderSize = sizeBorder;
            if (borderSize<0){
                System.out.println("Invalid input!");
            }
        } while (borderSize<0);
        do{ /*Square Color*/
            System.out.print("Enter the color of the square: ");
            int colorSquare = sc.nextInt();
            squareColor = colorSquare;
            if ((squareColor>1)||(squareColor<0)){
                System.out.println("Invalid input!");
            }
        }while ((squareColor>1)||(squareColor<0));
        do{ /*Border Color*/
            System.out.print("Enter the color of the border: ");
            int colorBorder = sc.nextInt();
            borderColor = colorBorder;
            if ((borderColor>1)||(borderColor<0)){
                System.out.println("Invalid input!");
            }
        } while ((borderColor>1)||(borderColor<0));
        //PBM line49-53
        System.out.println("PBM File Contents: ");
        System.out.println("P1");
        //Calculation line52
        int widthHeight = (borderSize*2)+squareSize;
        System.out.println(widthHeight+ " "+ widthHeight);
        //Loops
        for(int border = 0; border<widthHeight;border++){
            for (int block = 0;block<widthHeight;block++){
                //inner square line58
                if (((border>=borderSize)&&(border<widthHeight-borderSize))&&((border<widthHeight-borderSize)&&(block>borderSize-1)&&(block<widthHeight-borderSize))){
                    System.out.print(squareColor);
                }
                else{
                   System.out.print(borderColor);
                }
            }
            System.out.println();
        }
    }
}
