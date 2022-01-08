package com.operator0108;

public class Demo1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // 字符串连接符 + ， String
        System.out.println(""+a+b); // 1020

        System.out.println(a+b+""); // 30

        // 三目运算符
        int c = a > b ? a : b;
        System.out.println(c); // 20

    }
}
