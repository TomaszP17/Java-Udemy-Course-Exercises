public class sumOds {
    public static void main(String[] args) {
        System.out.println(sumOdd(-1,100));
    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        if(number % 2 != 0){
            return true;
        }else {
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        if(end < start){
            return -1;
        } else if (start < 0 || end < 0) {
            return -1;
        }else {
            int sum = 0;
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
    }
}
