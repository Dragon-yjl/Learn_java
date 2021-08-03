package nowCoder8_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String str = s.next();
            char c = str.charAt(0);
            if(c >=65&& c<=90 || c>=97&&c<=122) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }


    }
}
