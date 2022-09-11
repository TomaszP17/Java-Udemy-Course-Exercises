public class MegaBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = kiloBytes / 1024;
            int rest = kiloBytes - megaBytes * 1024;
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + rest + " KB");
        }
    }
}
