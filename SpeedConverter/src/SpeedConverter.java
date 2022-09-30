public class SpeedConverter {
    public static long toMilesPerHour(double kms){
        if(kms < 0)
            return -1;
        return Math.round(kms/1.609);
    }
    public static void printConversion(double kms){
        if(kms < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int mps = (int)toMilesPerHour(kms);
        System.out.println(kms + " km/h = "
                + mps + " mi/h"
        );
    }
}
