import java.util.Scanner;

public class MinimumElement {
    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array =    new int[size];
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
}
