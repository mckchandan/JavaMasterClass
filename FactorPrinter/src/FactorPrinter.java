public class FactorPrinter {
    public static void printFactors(int first){
        if ( first >= 1){

            for (int i=1; i<=first; i++){
                if ((first%i==0)){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
