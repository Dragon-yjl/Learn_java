package reference;


import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

class Animal {
    public String name;

    public void eat() {
        System.out.println("Animal 吃东西");
    }

    public void sleep() {

        System.out.println("Animal 睡觉");
    }

}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat吃猫粮");
    }

    public void jump() {
        System.out.println("cat 跳");
    }
}
public class TestDemo {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();
        animal.sleep();
        //不能animal.jump();
        //如果非要调，就要向下转型

        Animal animal1 = new Cat();
        Cat cat = (Cat) animal;
        ((Cat) animal).jump();
        cat.jump();




//        Cat cat = new Cat();
//        cat.eat();;
//        cat.sleep();
//        cat.jump();


    }
}
