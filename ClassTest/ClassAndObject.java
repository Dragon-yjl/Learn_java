package ClassTest;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * class 类名 {
 *     属性/字段：年龄，性别
 *     行为/方法：
 *
 * }
 * 1.实例化一个对象 Person person = new Person()
 * 2.一个类可以产生/实例化 多个对象
 * 3，字段：类里面，方法外面定义的变量，叫做字段，也叫成员变量，成员属性
 * 4.基本类型的默认值。
 *   引用类型默认值null
 *   简单类型：对应的0值。boolean:false  char :'\u0000'
 * 5.访问成员变量，对象的引用，访问成员变量：对象引用.成员变量名
 *               person.name   person.age
 *6.方法也叫做，成员方法： 对象引用.成员方法名
 *               person.eat()  person.sleep
 *7.静态成员变量的访问形式
 *   类名.成员变量。静态成员变量只有一份，存放在方法区
 *   Person.count
 *   类名.静态成员方法
 *  Person.fun
 *
 * 注意：
 *  1.静态方法内，不允许调用非静态方法，相反可以
 *  2.静态方法内，不能够访问非静态的成员变量
 *  静态方法是不依赖于对象的Person.fun()
 *  非静态方法要用对象的引用来进行访问的
 *  Person p = new Person();
 *  p.eat();
 */
class Person {
    //属性
    public int age;
    public String name;
    //成员变量，在堆中，每一个实例化对象都可以调用一份，可以有很多分
    public static int count;
    //静态成员变量只有一份，不属于对象，共同拥有，存放在方法区

    //方法
    public void eat() {//方法必须要new一个对象才能被调用
        fun();
        System.out.println("人吃饭");

    }
    public void sleep() {
        System.out.println("人睡觉");
    }
    public static void fun() {
        ///eat();不行
        System.out.println("学习");
    }

}
public class ClassAndObject {



    //系统调用的
    //为什么main方法是静态的,因为静态方法不依赖于对象
    public static void main(String[] args) {

        //Person person = null;//NullPointerException
        // 空指针异常 ，自己定义的所以是引用数据类型，可以赋值
        Person person = new Person();
        person.age = 10;
        person.name = "顾陌";
        person.eat();
        person.sleep();
        System.out.println(person.age+" "+person.name);
        System.out.println(person.count);//0可以这样访问，但是一般不这样写
        System.out.println(Person.count);//0一般都是这样访问


        Person.fun();

        Person person1 = new Person();
        person1.count++;//应该改为Person.count++;
        System.out.println(person1.count);//1
        //输出Person.count

        Person person2 = new Person();
        person2.count++;//不建议这样写，改为Person.count++;
        System.out.println(person2.count);//2
        ////输出Person.count



        //与person2没有关系，只有一个count存放在方法区
    }

    public static void main1(String[] args) {
        Person person = new Person();//new实例化一个对象，创建一个对象
        Person person1 = new Person();//可以实例化多个对象

    }
}
