public class Main {
    public static void main(String[] args) {
        int[] array = SortedArray.getIntegers(5);
        SortedArray.printArray(array);
        array = SortedArray.sortIntegers(array);
        SortedArray.printArray(array);
    }


}