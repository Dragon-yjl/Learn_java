package test_1027;

public class Palindrome {


    public static boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur*10 + num %10;
            num /= 10;
        }

        return cur == x;

    }


    public static void main(String[] args) {

        int x = 1234321;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);
    }
}
