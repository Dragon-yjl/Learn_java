package com.oop.poly;

public class Person {

    public void run() {
        System.out.println("Person sun!!!");
    }
}


/*
多态：
    1.多态是方法的多态，与属性无关
    2.父类和子类，有联系， Person s2 = new com.oop.poly.Student();
    classCastException类型转化异常
    3.存在条件：继承关系，方法需要重写，父类引用指向子类对象 Father f1 = new Son()；



    public static void main(String[] args) {

        //一个对象的实际类型是确定的

        //但是可以指向的引用类型就不确定了：父类的引用可以指向子类

        // 当子类重写了父类的方法之后，执行子类的方法
        //Student能调用的方法都是自己的或者继承父类的
        com.oop.poly.Student s1 = new com.oop.poly.Student();

        //Person父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new com.oop.poly.Student();

        Object s3 = new com.oop.poly.Student();

        // 对象能执行那些方法，主要看对象左边的类型，与右边的关系不大
        s1.run();

        s2.run();

        s1.eat();

        //父类类型不能调用子类独有的方法，只能了强制类型转换后执行子类的方法
        ((com.oop.poly.Student) s2).eat();

    }
 */