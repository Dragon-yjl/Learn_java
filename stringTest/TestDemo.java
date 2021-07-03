package stringTest;

import java.util.Scanner;

public class TestDemo {


    public static void main(String[] args) {

        String str = "  alij jqpwo  ";
        System.out.println(str.trim());//q去掉左右空格 alij jqpwo

        System.out.println(str.toUpperCase());//  ALIJ JQPWO
        String str1 = "ADFGHJ";
        System.out.println(str1.toLowerCase());//adfghj
        System.out.println(str1.concat("sfweiu"));//ADFGHJsfweiu

        String str3 = "";
        String str4 = null;
        System.out.println(str3.isEmpty());//true
        System.out.println(str4.isEmpty());//NullPointerException

    }

    public static String connectStr(String str) {

        String ret = "";
        String[] s = str.split(" ");
        for(String ss : s) {
            ret += ss;
        }

        return ret;
    }

    public static void main1(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String ret = connectStr(str);
        System.out.println(ret);
    }
}
