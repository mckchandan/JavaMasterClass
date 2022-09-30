public class Main {
    public static void main(String[] args) {
        int size = MinimumElement.readInteger();
        int[] array=MinimumElement.readElements(size);
        System.out.println(MinimumElement.findMin(array));
    }
}