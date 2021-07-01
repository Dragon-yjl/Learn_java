package oop7_01;

/***
 * 抽象方法：被abstract
 * 抽象类:包含抽象方法的 也要用abstract class
 * 1.抽象类是不可以被实例化的，抽象类不能是private
 * 2.抽象类和普通类的区别在于多了一个抽象方法,不能被实例化
 * 3.如果一个普通类继承了一个抽象类，那么这个普通类一定要
 * 重写抽象类当中的抽象方法
 * 4,抽象方法一定要被重写的
 * 5.如果一个类继承了抽象类，且不想写抽象类的方法，那么这个类就只能是抽象类了
 *
 * c抽象类存在的巨大意义就是为了继承
 *
 * 抽象类的出现，其实也是方便程序员为了检查代码，如果是抽象类被继承，方法不被重写就要报错
 *
 * 抽象类也可以法神向上转型和多态的
 */

abstract class Shape {//包含抽象方法的类就叫做抽象类
    //抽象方法：被abstract所修饰的方法，抽象方法是没有具体的实现的
    public abstract void draw();//不能是private，因为如果是private就不能被重写，而抽象类方法一定要重写
    public int a;
    public void func() {};
}

class Cycle extends Shape {//如果一个普通类继承了一个抽象类，那么这个普通类一定要重写抽象类当中的抽象方法

    @Override
    public void draw() {
        System.out.println("Cycle:画个圆○");
    }
}

abstract class person {

    public String name;

    public person(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Person::eat()'");
    }

    public void func() {

    }

}

class Student extends person {

    public Student(String name) {
        super(name);
    }

    @Override
    public void func() {
        System.out.println(this.name+"Student:func()");
    }
}

public class TestDemo {

    public static void draMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {


        //Shape shape = new Shape();抽象类不能被实例化

        Cycle cycle = new Cycle();
        cycle.draw();

        Shape shape = new Cycle();
        draMap(shape);
    }


}
