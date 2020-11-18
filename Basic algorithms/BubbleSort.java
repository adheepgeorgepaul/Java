import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args){
        int length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit!");
        length = in.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the numbers : ");
        for(int i = 0; i < length; i++){
            array[i] = in.nextInt();
        }
        in.close();
        System.out.println("Entered Array : " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Sorted Array : " + Arrays.toString(array));
        printArray(array);
    }

    public static void bubbleSort(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1] ){
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }
        
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
    }

    public static void printArray(int[] array){
        for(int item: array){
            System.out.print(item + " ");
        }
    }
}