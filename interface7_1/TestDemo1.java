package interface7_1;

/**
 * 理解接口
 *
 * 接口也可以发生转型，也可以实现多态
 */

class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }
}


interface IFlying {
    void fly();

}

interface IRunning {
    void run();

}

interface ISwimming {
    void swim();

}


//先继承后接口实现
class Cat extends Animal implements  IRunning {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在用四条腿跑步");
    }
}

class Fish extends Animal implements ISwimming {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在用尾巴游泳");
    }
}

class Bird extends Animal implements IFlying {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }
}


class Frog extends Animal implements IRunning,ISwimming{
    public Frog(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println(this.name+"正在往前跳");
    }

    @Override
    public void swim() {

        System.out.println(this.name+"正在蹬腿游泳");
    }
}

class Duck extends Animal implements IRunning,IFlying,ISwimming {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在用翅膀飞");
    }

    @Override
    public void run() {

        System.out.println(this.name+"正在用两条腿跑");
    }

    @Override
    public void swim() {

        System.out.println(this.name+"正在飘在水上");
    }
}

class Robot implements IRunning {

    @Override
    public void run() {
        System.out.println("我是机器人，我在跑！");
    }
}


public class TestDemo1 {

    public static void walk(IRunning iRunning1) {
        iRunning1.run();
    }

    public static void main(String[] args) {

        IRunning iRunning1 = new Robot();
        IRunning iRunning2 = new Frog("青蛙");
        IRunning iRunning3 = new Cat("咪咪");
        walk(iRunning1);
        walk(iRunning2);
        walk(iRunning3);
    }


    public static void main1(String[] args) {

        IRunning iRunning1 = new Robot();
        iRunning1.run();

        IRunning iRunning2 = new Frog("青蛙");
        iRunning2.run();

        IRunning iRunning3 = new Cat("咪咪");
        iRunning3.run();
    }

}
