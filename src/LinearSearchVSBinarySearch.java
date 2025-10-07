//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 6A
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class Assignment6A {
    public static void main(String[]args){
        Random random = new Random();
        int holder = 0;
        int randNum= random.nextInt(1000018);
        System.out.println("[Linear Vs. Binary Search]");
        int[] array = new int[1000019];
        for(int x=0;x<array.length;x++){
            array[x]=1000018-x;
        }
        System.out.println("The target value is "+ randNum);
        //linear search
        boolean found = false;
        for (int numberTimes = 1; numberTimes<array.length;numberTimes++){
            if (array[array.length-numberTimes]==randNum){
                found=true;
                holder=numberTimes;
                break;
            }
        }
        System.out.println("Linear Search: "+holder+" loop(s)");
        //binary search
        int guess=0;
        int low=0;
        int high= array.length-1;
        while (high>=low){
            int mid=(high+low)/2;
            if (randNum<array[mid]){
                high=mid-1;
                guess++;
            }
            else if(randNum==array[mid]){
                found=true;
                guess++;
                break;
            }
            else{
                low=mid+1;
                guess++;
            }
        }
        System.out.println("The Binary Search: "+ guess+" guess(es)");
        //comparing linear and binary
        if (holder>guess){
            System.out.println("Binary Search is faster this time!");
        }
        else if(holder<guess){
            System.out.println("Linear Search is faster this time!");
        }
    }
}
