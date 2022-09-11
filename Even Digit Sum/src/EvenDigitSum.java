public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2000));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            int pom = number % 10;
            if(pom % 2 == 0){
                sum += pom;
            }
            number /= 10;
        }
        return sum;
    }
}
