public class EqualSumchecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
    }
    public static boolean hasEqualSum(int first, int second, int third){
        if(first + second == third) {
            return true;
        } else {
            return false;
        }
    }
}
