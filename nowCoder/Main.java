package nowCoder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();

        int num1 = Integer.valueOf(str1.substring(2,str1.length()),16);
        int num2 = Integer.valueOf(str2.substring(1,str2.length()),8);

        System.out.println(num1+num2);
    }
}
