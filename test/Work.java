package Test;

import java.awt.peer.LightweightPeer;
import java.util.Scanner;

public class Work {

    public static boolean isVowel (char c) {
        if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E')
                || (c == 'I') || (c == 'O') || (c == 'U')) {
            return true;
        }else {
            return false;
        }
    }
    public  static String   reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;

        while (left < right) {
           if(!isVowel(ch[left])) {
               left++;
               continue;
           }else if(!isVowel(ch[right])){
               right--;
               continue;
           }else {
               char tmp = ch[left];
               ch[left] = ch[right];
               ch[right] = tmp;
           }
           left++;
           right--;
        }

        return new String(ch);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(reverseVowels(str));
    }
}
