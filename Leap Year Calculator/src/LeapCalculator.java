public class LeapCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
    }
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){ //jesli jest podzielny przez 4 to...
                if(year % 100 == 0){ //jesli jest podzielny przez 100 to...
                    if(year % 400 == 0){ //jesli jest podzielny przez 400 to...
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else { //jesli nie jest
                return false;
            }
        }
        else{
            return false;
        }
    }
}
