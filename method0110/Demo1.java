package com.yjl.method0110;

public class Demo1 {

    public static void main(String[] args) {

        //求阶乘  递归

        System.out.println(fun(6));


    }

    public static int fun(int n) {

        if(n ==1) {
            return 1;
        }else {
            return n*fun(n-1);
        }
    }
}
