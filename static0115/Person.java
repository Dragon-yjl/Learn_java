package com.oop.static0115;

public class Person {

    // 第二个加载 用来赋初始值
    {
        System.out.println("匿名代码块");
    }

    // 第一个加载  只执行一次
    static {
        System.out.println("静态代码块");
    }

    // 第三个加载
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {

        Person p = new Person();
    }
}
