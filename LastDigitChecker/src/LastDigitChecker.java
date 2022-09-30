public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b,int c) {
        if(a <10 || a> 99 || b < 10 || b> 99 || c < 10 || c> 99)
            return false;
        a = a%10;
        b=b%10;
        c=c%10;
        return (a ==b || a == c || b==c);
    }
}
