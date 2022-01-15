package com.oop.static0115;

// import  java.lang.Math.random; // 直接导入Math下的方法,但是不加static会报错
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class Test {


    public static void main(String[] args) {

        System.out.println(Math.random()); // 随机打印一个值

        // 如果使用的时候不想每次都写Math，就可以使用静态导包

        // 就可以直接使用了
        System.out.println(random());
        System.out.println(PI);

    }
}
