package com.oop.extendsDemo1;

/**
 * super注意点
 *  1.super调用父类的构造放大，必须在构造方法的第一行
 *  2.super必须只能出现在子类的方法或者构造方法中
 *  3.super和this不能同时调用构造方法
 *
 *  this注意点
 *      代表的对象不同：
 *      this：本身调用者这个对象
 *      super：代表父类对象的引用
 *
 *      前提：
 *      this没有继承也可以使用
 *      super：必须在继承条件中才可以使用
 *
 *      构造方法：
 *      this() : 本类的构造
 *      super() ;  父类的构造
 */

public class Person {

    public String name;
    public int age;
    private String sex;

    public Person() {
        System.out.println("Person无参执行了！！~~");
    }

    public void say() {
        System.out.println("Person" + this.name+"在说话！！！");
    }

    public void print () {
        System.out.println("Person");
    }


}
