package com.oop.static0115;

public class Student {

    // 静态的属性和方法都是跟类一起加载的
    private static int age; // 静态变量 跟类一起加载，多线程会用到
    private double score; // 非静态变量

    // 非静态方法
    public void run() {
        go(); // 非静态方法中可以调用静态方法
    }

    // 静态方法
    public static void go() {
        // run(); // 但是静态方法不能调用非静态方法
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        // 如果是静态变量，推荐用类名访问
        System.out.println(s1.age); // 静态变量可以用new的对象引用
        System.out.println(Student.age); // 也可以用类直接引用

        // 如果是非静态变量，只能用new的对象访问
        System.out.println(s1.score); // 非静态变量可以用new对象引用
        // System.out.println(Student.score); // 但是不可以用类引用

        //  对于静态方法 可以使用类名调用,y也可以直接调用，
        go();
        Student.go();

        // 但是对于非静态方法,只能通过new的对象调用，不能直接调用，也不能用类名调用
        s1.run();
//        run();
//        Student.run();
    }
}
