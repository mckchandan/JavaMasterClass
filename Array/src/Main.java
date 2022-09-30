import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printIntegers(array);
    }

    public static int[] getIntegers(int number){
        int[] values = new int[number];
        for(int i=0;i<number;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static void printIntegers(int[] array){
        int sum=0;
        for(int i=0;i< array.length;i++){
            System.out.println("Element " + i +" is " + array[i]);
            sum+=array[i];
        }
        System.out.println("Average is " + (int) sum / array.length);
    }

}