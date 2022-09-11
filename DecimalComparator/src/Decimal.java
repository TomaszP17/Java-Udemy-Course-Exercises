public class Decimal {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int a = (int) (first * 1000);
        int b = (int) (second * 1000);
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
