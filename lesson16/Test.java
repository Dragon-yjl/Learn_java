package com.exception.lesson16;

public class Test {

    // 可能会存在异常方法

    static void test(int a) throws MyException {

        System.out.println("传递的参数为"+a);
        if(a > 10) {
            throw new MyException(a);  // 可以在这捕获也可以抛出让调用这个方法的地方处理
        }

        System.out.println("OK");
    }


    public static void main(String[] args) {

        try {
            test(11);
        } catch (MyException e) {
            System.out.println("MyException=>"+e);
        }
    }
}
