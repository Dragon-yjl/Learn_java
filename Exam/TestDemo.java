package Exam;

import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String str = scan.nextLine();

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < str.length();i++) {
                char ch = str.charAt(i);
                if(!sb.toString().contains(ch+"")) {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
