public class SpeedConverter {
    public static long toMilesPerHour(double x){
        if(x < 0){
            return -1;
        }
        return Math.round(x / 1.609);
    }

    public static void printConversion(double x ){
        toMilesPerHour(x);
    }
}
