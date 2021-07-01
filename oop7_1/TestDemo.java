package oop7_1;


/**
 * 向上转型
 * 父类引用子类
 *
 * 向下转型（非常不安全）
 * 把父类给子类，子类引用父类
 */
class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
        this.eat();//动态绑定
        //构造方法也会发生动态绑定
    }

    public void eat () {
        System.out.println("Animal:eat()");
    }
}

class Cat extends Animal {

    public Cat (String name) {
        super(name);
    }

    public void eat () {//重写
        System.out.println("Cat:eat()");
    }
}


class Bird extends Animal {

    public Bird (String name) {
        super(name);
    }

    public void eat () {
        System.out.println("Bird:eat()");
    }

    public void fly() {
        System.out.println("Bird:fly()");
    }
}

public class TestDemo {

    public static void main(String[] args) {

        Animal animal = new Cat("咪咪");
    }


    public static void main1(String[] args) {


//        Animal animal = new Bird("八哥");
//        animal.eat();
//
//        //向下转型
//        Bird bird = (Bird) animal;//鸟跟
//        bird.fly();

        Animal animal = new Cat("咪咪");
        animal.eat();
//        Bird bird = (Bird) animal;//类型转换异常，猫跟鸟没有关系
//        bird.fly();

        //如果要向下转型，加入一个if语句，判断animal是否能转换成Bird
        if(animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        }
    }
}
