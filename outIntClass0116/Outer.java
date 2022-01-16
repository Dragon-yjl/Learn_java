package com.oop.outIntClass0116;

// 外部类
public class Outer {

//    private int id = 22;
//    public void out() {
//        System.out.println("这是外部类的方法");
//    }
//
//    // 内部类 如果声明为static就是静态内部类
//    public class Inner {
//        public void in() {
//            System.out.println("这是内部类的方法");
//        }
//
//        // 内部类可以获取外部类的私有属性
//        public void getId() {
//            System.out.println(id);
//        }
//    }


    // 局部内部类 写到方法里面的class
    public void method() {
        class Inner{
            public void in() {

            }
        }
    }

}


/*

    // 内部类外部类
    public static void main(String[] args) {

        // 实例化外部类
        Outer outer = new Outer();
        // 通过这怪外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();

        inner.getId();


    }
 */