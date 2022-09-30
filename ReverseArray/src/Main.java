public class Main {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        ReverseArray.reverse(array);
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}