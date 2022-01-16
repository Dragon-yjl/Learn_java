package com.exception.lesson0116;

public class Test2 {
    public static void main(String[] args) {

        try {
            new Test2().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    // 假设在方法中处理不了这个异常，就可以往外抛出去
    public void test(int a,int b) throws ArithmeticException {
        if(b==0) {
            throw new ArithmeticException();// 主动抛出异常，一般用在方法中
        }
    }
}
