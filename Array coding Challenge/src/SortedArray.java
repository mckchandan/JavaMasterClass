import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new  int[number];
        for(int i=0;i<number;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println("Element " + i +" contents " +array[i]);
        }
    }

    public static int[]  sortIntegers(int[] unsortedArray){
//        int[] sortedArray = new int[unsortedArray.length];
//        for(int i=0;i<unsortedArray.length;i++){
//            sortedArray[i] = unsortedArray[i];
//        }

        int[] sortedArray = Arrays.copyOf(unsortedArray,unsortedArray.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
