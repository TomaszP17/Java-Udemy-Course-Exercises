public class Methody {
    public static void main(String[] args) {
        printConversion(10.42);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            long Miles = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + Miles + " mi/h");
        }
    }



}
