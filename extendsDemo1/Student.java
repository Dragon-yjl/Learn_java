package com.oop.extendsDemo1;

public class Student extends Person{

    public String name = "顾奈";
    public int age;

    public Student() {
        //隐藏代码。调用了父类的无参构造
        //super和this不能同时出现，因为不可能都在第一行

        super(); // 可有可无，用this和super调用构造器的时候必须放在第一行
        System.out.println("Student无参执行了！！~~");
    }

    public void print() {
        System.out.println("Student");
    }

    public void test1() {
        print();
        this.print();
        super.print();
    }

    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

        say();
    }

}

/*

    public static void main(String[] args) {

        com.oop.extendsDemo1.Student s = new com.oop.extendsDemo1.Student();
// 当new一个Student的时候，先执行父类的无参构造，在执行子类的无参构造方法
//        System.out.println(s.name);

      //  s.test("顾陌");

//        s.print();
//        s.test1();


    }
 */