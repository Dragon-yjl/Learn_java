package interface7_1;

/**
 * 接口  里面不能有具体实现的方法
 * 1.所有的方法默认是public abstract
 * 2.所有的成员变量默认一定是 public static final的，一定要初始化
 * 3.接口也是不可以被实例化的
 * 4.类和接口的关系：implements
 * 5.接口也是可以发生向上转型的，也就是可以发生多态，运行时动态绑定
 * 6.一个类可以实现多个接口 class Demo implements IA,IB
 * 7.接口与接口之间的关系class Demo implements IA,IB
 * 一旦有类实现了接口ID那么这个接口需要重写的是IA,IB,IC三个接口的抽象方法
 *
 * 8.接口的出现弥补了java的缺陷，实现了多继承
 *
 */

interface Shape {

    public abstract void draw();
    //或 void draw();

    public static final int COUNT = 10;
    //或 int COUNT = 10;

    //JDK1.8新特性
    //接口不能再里面实现方法 除非被default修饰
    default void func() {

        System.out.println("default::func");
    }
    default void func1() {
        System.out.println("default::func1()");
    }

}


class Cycle implements Shape {

    //接口要实现就要重写
    @Override
    public void draw() {
        System.out.println("cycle： 画一个○");

    }
}

class Rect implements Shape {

    @Override
    public void draw() {
        System.out.println(" rect :画一个♦");
    }
}



interface IA {
    void funcA();
}

interface IB {
    void funcB();
}

//一个类可以实现多个接口
class Demo implements IA,IB {
    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}


//接口与接口之间的关系
//extends 扩展，此时TD同时拥有了IA,IB两个接口的功能
interface ID extends IA,IB {
    void funcD();
}

class Demo1 implements ID {
    @Override
    public void funcD() {

    }

    @Override
    public void funcA() {

    }

    @Override
    public void funcB() {

    }
}



public class TestDemo {

    public static void drawMap (Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {

        // 接口不能被实例化Shape shape = new Shape();
        //接口也可以发生向上转型

        Shape shape = new Cycle();
        drawMap(shape);
        shape.draw();

        Shape shape1 = new Rect();
        drawMap(shape1);
        shape1.draw();

    }

}
