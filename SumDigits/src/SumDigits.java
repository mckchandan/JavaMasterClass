public class SumDigits {
    public static int SumDigits(int n){
        if(n<=9)
            return -1;
        int sum=0,rem=0;
        while(n>0){
             rem = n % 10;
             n = n/10;
             sum += rem;
         }
        return sum;
    }
}
