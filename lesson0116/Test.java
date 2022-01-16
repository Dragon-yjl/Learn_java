package com.exception.lesson0116;

public class Test {

    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        // 假设要捕获多个异常，就可以从小到大依次捕获

        try { // try监控区域
            System.out.println(a/b);
        } catch (Exception e) { // catch(想要捕获的异常类型)捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally { // 最后执行 可以没有
            System.out.println("finally");
        }
    }
}
