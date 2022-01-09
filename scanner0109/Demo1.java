package com.yjl.scanner0109;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            String str = s.next();
            System.out.println(str);
        }

        /**
         * next()
         * 1.一定要读取到有效字符后才可以结束输入
         * 2.对输入的有效字符之前遇到的空白，next()会自动将其去掉
         * 3.只有输入有效字符后才将其后面面输入的空白作为分隔符或者结束符
         * next()不能得到带有空格的字符串
         *
         * nextLine()
         * 1.以Enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有字符
         * 2.可以获得空白（带有空格的字符串）
         */

        s.close();
    }
}
