package com.learn0108;

public class Demo1 {

    public static void main(String[] args) {

        // 二进制0b   八进制0
        // 十进制     十六进制0x
        int a = 10;
        int b = 010;
        int c = 0b10;
        int d = 0x10;

        System.out.println(a); // 10
        System.out.println(b); // 8
        System.out.println(c); // 2
        System.out.println(d); // 16

        //浮点数扩展  银行业务怎么表示钱的
        //使用BigDecimal 数学工具类表示银行业务

        // float 表示的数是有限的，离散的，是舍入误差的表示，是一个大约值
        // 表示接近但不等于
        //最好完全避免使用浮点数去比较

        float f = 0.1f; // 0.1
        double dd = 1.0/10; // 0.1
        System.out.println(f == dd); //false

        float d1 = 312479184148824f;
        float d2 = d1+1;
        System.out.println(d1 == d2); // true


        // 字符拓展
        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1); // a
        System.out.println((int)c1); // 97

        System.out.println(c2); // 中
        System.out.println((int)c2); //  20013

        // 所有字符本质都是数字，编码Unicode表 2字节   0 -- 65536（2^16）\

        // 区间范围：U0000 到 UFFFF

        char c3 = '\u0061'; // 表示转义字符,十六进制
        System.out.println(c3); // a

    }
}
