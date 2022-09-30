public class Sum5and3 {
    public static void print(){
        int count=0,sum=0;
        for(int i=0;i<1000 && count<=5;i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println(i);
                count++;
                sum+=i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
