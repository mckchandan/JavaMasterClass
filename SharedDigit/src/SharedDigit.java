public class SharedDigit {
    public static boolean hasSharedDigit(int a,int b) {
        int LastA = 0, LastB = 0;
        if( a < 10 || a > 99 || b < 10 || b > 99 )
            return false;
        while (a != 0) {
            LastA = a % 10;
            while (b != 0) {
                LastB = b % 10;
                if (LastA == LastB) {
                    return true;
                } else {
                    b /= 10;
                }
            }
            a /= 10;
        }
        if (LastA == LastB) {
            return true;
        }
        return false;
    }
}

