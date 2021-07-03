package string2;

import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {

        char[] value = {'a','b','c','d'};
        //把字符数组转换为字符串
        String str1 = new String(value);
        System.out.println("字符串"+ str1);//abcd

        //从数组第一个字符开始，偏移两个打印输出
        //offset第几个字符开始  count偏移几个打印  这两个一定不能越界
        String str2 = new String(value,1,2);
        System.out.println(str2);//bc


        //字符串转变为字符
        //单个转变
        String str3 = "hello";
        char ch = str3.charAt(0);//把字符串当成字符数组，打印0号下标位置的字符
        System.out.println(ch);//h

        //全部转变
        char[] chars = str3.toCharArray();
        System.out.println(Arrays.toString(chars));//[h, e, l, l, o]

    }
}
