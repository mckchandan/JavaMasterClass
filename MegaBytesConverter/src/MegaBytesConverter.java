public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
            return;
        }
        int MegaBytes =0 ,KB= 0;
        MegaBytes = kiloBytes / 1024;
        KB = kiloBytes % 1024;
        System.out.println(kiloBytes+" KB = "+ MegaBytes +" MB and " + KB +" KB");
    }
}
