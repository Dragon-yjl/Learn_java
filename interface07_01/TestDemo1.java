package interface07_01;

import java.util.function.Predicate;

/**
 * 接口
 * 克隆
 *
 * 对自定义类型，进行深拷贝
 *就要用到克隆接口
 *
 * cloneable空接口：标记接口，标记当前类是可以克隆的
 */

class Money implements Cloneable {

    public double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public String name;
    public  Money m;

    public Person(String name) {
        this.name = name;
        this.m =  new Money();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    //重写Object的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.m = (Money) this.m.clone();
        return person;
    }
}


public class TestDemo1 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person1 = new Person("guno");
        Person person2 =(Person) person1.clone();

        //System.out.println(person2);

        System.out.println(person1.m.money);
        System.out.println(person2.m.money);

        person2.m.money = 18.9;

        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
