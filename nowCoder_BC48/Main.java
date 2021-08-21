package nowCoder_BC48;

import java.util.Scanner;

public class Main {
    //法一
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            String s = sca.nextLine();
            char c =s.charAt(0);
            if(c >= 'a' && c <= 'z') {
                System.out.println(s.toUpperCase());
            }else {
                System.out.println(s.toLowerCase());
            }
        }
    }
    //法二
    public static void main1(String[] args) {

        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            char c = sca.next().charAt(0);
            if(c >= 65 && c <= 90) {
                System.out.println((char)(c+32));
            }else if(c >= 97 && c <= 122) {
                System.out.println((char) (c-32));
            }
        }
    }
}
