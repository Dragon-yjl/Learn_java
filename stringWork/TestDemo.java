package stringWork;

import java.util.Scanner;

public class TestDemo {

    public static String reverse(String str,int begin, int end) {

        char[] ch = str.toCharArray();

        while (begin < end) {
            char tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;

            begin++;
            end--;
        }

        return String.copyValueOf(ch);
        //return new String(ch);

    }

    public static String reverseK(String str,int k) {

        if(str == null || k<=0 || k>= str.length())
            return  null;
        String str1 = reverse(str,0,k-1);

        String str2 = reverse(str1,k,str1.length()-1);

        String str3 = reverse(str2,0,str2.length()-1);

        return str3;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int k = scan.nextInt();
        //int k = str.length()/2;

        System.out.println(reverse(str,0,str.length()-1));

        System.out.println(reverseK(str,k));
    }
}
