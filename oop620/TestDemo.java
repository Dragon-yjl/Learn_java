package com.oop620;

/**
 * 组合
 * 学校类包括学生类和老师类
 *
 *
 * 多态：其实就是一种思想
 *
 * 向上转型：表现形式：
 * 1.直接赋值
 * 2.方法的传参
 * 3.返回值
 *
 * 动态绑定
 * 1.重写
 * 面试问题：重载（overload）和重写(override)的区别
 * 重载（同一个类中）
 * a.方法名相同
 * b.参数列表不同
 * c.返回值不做要求
 * 重写
 * a.方法名相同
 * b.参数列表相同（参数的个数，参数的类型）
 * c.返回值也要相同
 * 注意：
 * 1.要重写的方法，不能是private修饰的
 * 2.被final修饰的方法，不能被重写
 * 3.需要重写的方法的访问权限修饰符，子类的访问权限修饰符
 * 一定要大于或等于父类的访问权限修饰符
 *
 * 什么情况下发生动态绑定：
 * 1.父类的引用，引用子类的对象（向上转型）
 * 2.通过父类的引用，调用子类和父类重写的那个方法
 *
 * */

class Student{

}
class Teacher {

}
class school {
    public Student[] students;
    public Teacher[] teacher;
}

class Animal {

    public String name;

    public void eat() {
        System.out.println(this.name+"正在吃");
    }

    public void func() {
        System.out.println("func");
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);//显示的调用父类构造方法，带有一个参数的构造方法，这个参数就是String类型的
        //上面这句话必须放到第一行

    }

    public void jump() {
        System.out.println(this.name +"正在跳");
    }

    //方法的重写
    public void eat() {
        System.out.println(this.name + "吃的是猫粮");
    }

}

class Birds extends Animal {

    public Birds(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name +"正在飞");
    }

}
public class TestDemo {


    public static void main(String[] args) {

//        Cat cat = new Cat("mimi");
//        cat.eat();//这个方法目前没有，那么久调用父类的
//        cat.jump();
//        cat.func();//这个方法目前没有，那么久调用父类的
//        //cat 继承 Animal ，不仅仅可以访问自己的，还可以
//        //访问Animal的方法或成员


        Animal animal = new Cat("初一");
        animal.func();
        animal.eat();//如果cat里面重写了方法，就可以调用重写的这个方法
        //这就叫做发生了动态绑定
        //编译的时候仍然调用animal的eat方法
        //运行的时候调用了cat重写的eat方法
        //所以这个过程中发生了动态绑定
        //运行的时候吧cat中eat方法的地址给了animal中eat的地址

        //animal.jump;不可以访问
        //父类引用 引用子类对象的时候，animal只能访问自己特有的
    }
















    public static void func(Animal animal) {

        animal.eat();
    }

    //第三种方式 返回值
    public static Animal func1() {
        Cat cat = new Cat("咪咪");
        return cat;
    }

    public static void main11(String[] args) {


        ///1.向上转型的表现形式第一种方式
        // 直接赋值
        Animal animal = new Cat("coco");
        System.out.println(animal.name);
        //父类的引用，引用子类对象，我们就叫做向上转型

        //第二种方式
        //方法的传参

        Cat cat = new Cat("咪咪");
        func(cat);

        //第三种方式
        //返回值  func1()

    }

    public static void main1(String[] args) {

        Animal animal = new Animal("吉吉国王");

        System.out.println(animal.name);

        Cat cat = new Cat("毛毛");

        System.out.println(cat.name);

        Birds bird = new Birds("八哥");

        System.out.println(bird.name);
    }

}
