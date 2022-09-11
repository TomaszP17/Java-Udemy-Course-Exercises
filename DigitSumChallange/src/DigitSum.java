public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(10));
    }
    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }else {
            int sum = 0;
            while (number % 10 != 0) {
                int pom = number % 10;
                sum += pom;
                number /= 10;
            }
            return sum;
        }
    }
}
