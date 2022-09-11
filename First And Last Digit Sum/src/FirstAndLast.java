public class FirstAndLast {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int first = number % 10;
        int last = 0;
        while(number != 0){
            last = number % 10;
            number /= 10;
        }
        //System.out.println(first + " " + last);
        return last + first;
    }
}
