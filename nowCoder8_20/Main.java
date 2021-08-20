package nowCoder8_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            String str = sca.next();
            char c = str.charAt(0);
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i'
                    || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }

        }
    }
}
