public class LastDigitCheckerCode {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    public static boolean hasSameLastDigit(int first, int second, int third){
        if(first < 10 || first > 1000 || second < 10 || second > 1000 || third < 10 || third > 1000){
            return false;
        }else {
            int fa = first % 10;
            int fb = second % 10;
            int fc = third % 10;

            if((fa == fb || fa == fc ) || (fb == fa || fb == fc) || (fc == fa ||fc == fb)){
                return true;
            }else {
                return false;
            }
        }
    }
    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }else {
            return true;
        }
    }
}
