package testWork;

import java.util.SortedMap;

public class TestDemo1 {
    public static boolean isAdmin(String userld) {
        return userld.toLowerCase() == "admin";
    }

    public static String reverse (String str,int begin,int end) {

        char[] ch = str.toCharArray();

        while (begin < end) {
            for (int i = 0;i<ch.length;i++) {
                char tmp = ch[begin];
                ch[begin] = ch[end];
                ch[end] = tmp;
            }
            begin++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {

        String str = "asdhfjg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        //System.out.println(isAdmin("Admin"));
        //false 因为toLowerCase()方法返回的是一个新的 字符串

        String str = "abcdefg";
        System.out.println(str.substring(0, 3));//abc 前闭后开
    }
}
