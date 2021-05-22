package test522;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
* 类的结构之三，构造器（构造方法constructor）的使用
*
* 一.构造器作用
* 1.创建对象
* 2.初始化对象的属性（信息）
* 二.说明
* 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器
* 2.定义构造器的格式，权限修饰符 类名（形参列表）{}
* 3.一个类中定义的多个构造器，彼此构成重载
* 4.一旦我们显示的定义了类的构造器之后，系统就不在提供默认的空参构造器
* 5.一个类中，至少有一个构造器，要么自己定义，要么是默认的
* */
public class PersonTest1  {

    public static void main(String[] args) {

        //创建类的对象 new +构造器
        Person1 p = new Person1();
        p.eat();
        p.study();


        Person1 p1 = new Person1("Tom");
        System.out.println(p1.name);

        Person1 p2 = new Person1("Mike",18);
        System.out.println("名字："+p2.name +"\n年龄："+ p2.age);
    }
}

class Person1{

    //属性
    String name;
    int age;

    //构造器
    public Person1(){
        System.out.println("Person()```` ");
    }

    public Person1(String n){
        name = n;

    }

    public Person1(String n,int a){
        name = n;
        age = a;
    }

    //方法·
    public void eat(){
        System.out.println("人吃饭");
    }

    public void study(){
        System.out.println("人可以学习");
    }
}