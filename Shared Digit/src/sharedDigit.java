public class sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,53));
    }
    public static boolean hasSharedDigit(int first, int second){
        if(first < 10 || first > 99 || second < 10 || second > 99){
            return false;
        }else {
            int fa = first % 10; //prawa z pierwszej
            int fb = (first/10) % 10; // lewa z pierwszej
            int sa = second % 10; //prawa z drugiej
            int sb = (second/10) % 10; // lewa z drugiej

            if(fa == sa || fa == sb || fb == sa || fb == sb){
                return true;
            }else {
                return false;
            }
        }
    }
}
