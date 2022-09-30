public class ReverseArray {
    public static void reverse(int[] array){
        int maxIndex = array.length -1;
        int midIndex = array.length / 2;
        for(int i=0;i<midIndex;i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex -i] = temp;
        }
    }
}
