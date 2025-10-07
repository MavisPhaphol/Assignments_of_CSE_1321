//Class: CSE 1321L
//Section: J52
//Term: Spring 2023
//Instructor: Chandana Avadhani
//Name: Mavis Phaphol
//Assignment#: 6B
import java.util.Arrays;
import java.util.Random;
public class Assignment6B {
    public static int[] PrintArray(int size) {
        Random random = new Random();
        int[] printArray = new int[size];
        for (int x = 0; x < printArray.length; x++) {
            int ranNum = random.nextInt(359);
            printArray[x] = ranNum;
        }
        return printArray;
    }
    public static int[] shuffleArray(int[] array){
        //used Fisher-Yates example found on https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array as reference
        Random random = new Random();
        int index,temp;
        for (int x=array.length-1;x>0;x--){
            index=random.nextInt(x+1);
            temp=array[index];
            array[index]=array[x];
            array[x]=temp;
        }
        return array;
    }
    public static boolean check_if_sorted(int[]array){
        boolean sorted=false;
        for (int x=0;x< array.length;x++){
            if (array[x]<array[x+1]){
                sorted=true;
                return sorted;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        boolean sort = false;
        int size = 17;
        int attempts=0;
        int[] array;
        array=PrintArray(size);
        System.out.println("[Random Sort]");
        do{
            attempts++;
            if (sort){
                System.out.println("Printing array...");
                System.out.println(Arrays.toString(array));
                break;
            }
            else{
                array=shuffleArray(array);
                System.out.println("Printing array...");
                System.out.println(Arrays.toString(array));
                System.out.println("Not sorted yet!");
            }
        } while (!sort);
        System.out.println("Hooray, it's sorted! And it took "+attempts+" attempts!");
    }
}
