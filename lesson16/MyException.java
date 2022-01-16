package com.exception.lesson16;

import java.util.concurrent.Executors;

public class MyException extends Exception {

    // 传递数字>10
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    // 重写toString  异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
