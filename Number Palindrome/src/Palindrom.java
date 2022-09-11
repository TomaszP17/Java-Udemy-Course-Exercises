public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-221));
    }
    public static boolean isPalindrome(int number) {
        int reverse,sum=0,temp;
        //It is the number variable to be checked for palindrome

        temp=number;
        while(number != 0){
            reverse=number%10;  //getting remainder
            sum=(sum*10)+reverse;
            number=number/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
}
