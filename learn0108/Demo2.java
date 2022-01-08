package com.learn0108;

public class Demo2 {

    public static void main(String[] args) {

        // Bit比特位 用1b表示
        // Byte 字节 用1B表示 1B = 8b；
        // 1KB = 1024B;  1MB = 1024KB;  1GB = 1024MB;  1TB = 1024GB

        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割

        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;
        System.out.println(total); // -1474836480 计算的时候已经溢出了

        long total2 = money * years;
        System.out.println(total2); // -1474836480 先计算完结果在赋给long'类型的total2

        long total3 = money * ((long) years); // 正解
        System.out.println(total3); // 20000000000

        System.out.println();
    }
}
