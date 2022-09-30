public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second)
    {
        int greatest=-1;
        if(first<10||second<10){
            return greatest;
        }
        for(int i=1;i<=first && i<=second ;i++)
        {
            if(first%i==0&&second%i==0)
                greatest=i;
        }
        return greatest;
    }
}

