package com.oop.overWrite;

public class A extends B {

    // 静态方法
//    public static void test() {
//        System.out.println("A==>test!!!");
//    }

    /**
     * 重写：需要继承关系，子类重写父类的方法
     *  1.方法名必须相同
     *  2.参数列表必须相同
     *  3.修饰符：范围可以扩大但不能缩小
     *  4.抛出的异常，可以被缩小但不能被扩大
     *
     *  重写：子类的方法跟父类的必须要一致，方法体不同
     *  为什么重写：
     *      1.父类的功能子类不一定需要，活不一定满足
     *      2.
     */

    @Override
    public void test() {
        System.out.println("A==>test!!!");
    }


}

/*

    // A类和B类中静态方法和非静态方法是不一样的
    // 当在A，B类中定义了静态方法，方法的调用只和左边
    // A a || B b 有关，与右边的new无关

    // 当在A,B中定义非静态方法，就是方法的重写

    public static void main(String[] args) {

        // 静态方法
//        A a = new A();
//        a.test(); // A==>test!!!
//
//        // 父类的引用指向了子类
//        B b = new A();
//        b.test();// B==>test!!!

        // 非静态方法
        A a = new A();
        a.test(); // A==>test!!!

        // 父类的引用指向了子类
        B b = new A();
        b.test();// A==>test!!!

    }
 */