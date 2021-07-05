package reviewClass;

/**
 *  第一次new一个对象执行顺序执行顺序：
 *  1静态代码块：Person
 * 4静态代码块：Student
 * 2实例代码块：Person
 * 3Person的构造方法
 * 5实例代码块：Student
 * 6Student的构造方法
 *  不管什么，静态代码块一定先执行 然后是父类的实例代码块和构造方法
 *  最后才是子类的实例代码块和构造方法
 *
 * 静态代码块只会初始化一次，所以只会执行一次
 *
 *在new一个对象的执行顺序
 *
 * 2实例代码块：Person
 * 3Person的构造方法
 * 5实例代码块：Student
 * 6Student的构造方法
 *
 */

class Person {

    static  {
        System.out.println("1静态代码块：Person");
    }
    {
        System.out.println("2实例代码块：Person");
    }

    public Person () {
        System.out.println("3Person的构造方法");

    }
}
class Student extends Person {

    static  {
        System.out.println("4静态代码块：Student");
    }
    {
        System.out.println("5实例代码块：Student");
    }

    public Student () {
        System.out.println("6Student的构造方法");

    }

}
public class TestDemo {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("===============");

        Student student1 = new Student();
    }

}
