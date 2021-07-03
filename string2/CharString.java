package string2;

import java.util.Arrays;
import java.util.Scanner;

public class CharString {

    public static void main(String[] args) {

        String str = "java#20-spit#ghios";
        String[] result = str.split("-");
        for(String s: result) {
            //result [java#20, spit#ghios]
            String[] ss = s.split("#");
            //ss [java,20]

            for(String st : ss) {
                System.out.println(st);
            }
        }
//
//        String str = "hello word hello bit";
//        String[] result = str.split(" ",3);//
//        /**
//         * hello
//         * word
//         * hello bit
//         */
//        for(int i = 0;i<result.length;i++) {
//            System.out.println(result[i]);
//        }
    }

    public static void main22(String[] args) {

        String str = "abcdefab";
        String str1 = str.replace("ab","gg");//把ab替换为gg
        System.out.println(str1);
        String str2 = str.replaceFirst("ab","cpdd");
        System.out.println(str2);
    }

    public static void main2(String[] args) {

        String str1 = "abcde";
        String str2 = "Abcde";
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

        System.out.println(str1.compareTo(str2));//str1>str2

        System.out.println(str1.contains("bcd"));//true
    }

    public static void main1(String[] args) {

        byte[] by = {97,98,99,100,127};
        String str = new String(by);
        System.out.println(str);

        String str1 = "hello";
        byte[] byte1 = str1.getBytes();
        System.out.println(Arrays.toString(byte1));
    }

    public static boolean isNumber (String str) {

        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

    public static boolean isDigit(String str) {

        char[] ch = str.toCharArray();

        for(int i = 0;i< ch.length;i++) {
            if(ch[i] > '9' || ch[i] < '0') {
                return false;
            }
        }

        return true;

    }


    public static void main11(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isDigit(str));
        System.out.println(isNumber(str));

    }
}
