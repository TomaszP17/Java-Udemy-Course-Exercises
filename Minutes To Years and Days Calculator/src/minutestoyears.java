public class minutestoyears {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            //musze pokazac years and days
            long hours = minutes / 60;
            long newMinutes = minutes % 60;
            long days = hours / 24;
            long newHours = hours % 24;
            long years = days/ 365;
            long newDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + newDays + " d");
        }
    }
}
