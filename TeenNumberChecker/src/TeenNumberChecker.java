public class TeenNumberChecker {
    public static boolean hasTeen(int age1,int age2,int age3){
        if(age1>=13 && age1<=19) return true;
        if(age2>=13 && age2<=19) return true;
        if(age3>=13 && age3<=19) return true;
        return false;
    }
    public static boolean isTeen(int age1){
        if(age1>=13 && age1<=19) return true;
        return false;
    }
}
