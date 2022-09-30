public class EvenDigitSum {
    public static int getEvenDigitSum(int value) {
        int digit=0,sum = 0;
        if(value < 0)
            return-1;
        while(value >0){
            digit = value % 10;
            value /= 10;
            if(digit % 2 == 0)
                sum+=digit;
        }
        return sum;
    }
}
