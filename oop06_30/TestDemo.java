package oop06_30;
//标明类所在的包

/**
 * 继承的意义：
 * 1.代码的复用
 * 2.降低了代码的冗余
 * 子类（派生类）继承了除构造方法外所有的东西
 *
 * 注意：
 * java属于单继承,
 * 子类会继承除构造方法外所有的东西
 *
 *
 *  this与super关键字
 *  1.this关键字代表的是当前对象的引用，super代表的是父类的引用
 *  2.this.data:调用当前对象的成员变量
 *    this.func()调用当前对象的成员方法
 *    this.()调用当前类的构造方法
 *
 *    super.data:访问父类的成员变量
 *    super.func():访问父类的成员方法
 *    super.():调用父类的构造方法
 *
 *
 *    如果父类有个有参数的构造方法，子类继承了父类那么构造子类的时候
 *    需要先构造父类，
 *    子类要帮助父类来构造
 *
 *
 * final关键字
 * 1.可以修饰变量  final int SIZE = 10，常量，只能被初始化一次
 * 2.可以修饰类  （密封类） final class Animals 表示当前类不能被继承
 * 3.可以修饰方法 （密封方法） 当前修饰的方法不能被重写，
 *
 */

import java.util.Arrays;

 class Animal{
    protected String name;
    //protected就是为了继承而产生，可以在不同包中的子类访问
    //不同包中子类访问的时候要用super来访问

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name+"正在吃");
    }

}
class Cat extends Animal {

    public Cat(String name) {
        super(name);//显示的调用父类构造方法，带有一个参数的构造方法，这个参数就是String类型的
        //上面这句话必须放到第一行
        System.out.println("fgagaa");
    }


//    public void eat() {
//        System.out.println(this.name+"正在吃");
//    }

    public void jump() {
        System.out.println(this.name +"正在跳");
    }

}
class Birds extends Animal{

    public Birds(String name) {
        super(name);
    }
//
//    public String name;
//
//    public void eat() {
//        System.out.println(this.name+"正在吃");
//    }

    public void fly() {
        System.out.println(this.name +"正在飞");
    }

}
public class TestDemo {

    public static void main(String[] args) {

        Cat cat = new Cat("mimi");
        cat.name = "咪咪";
        cat.eat();
    }

    public static void main0(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println(demo2.val);
    }

}
