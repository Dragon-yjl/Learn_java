package Test6_17;


//一个类，会对应生成一个字节码文件
/**
 * 1.常量在那个地方，和是不是被final修饰没关系
 * 一个变量到底存在哪里，和其是不是成员变量或者是局部变量有关
 *
 * 2.从访问形式上来说，静态的成员方法和属性都是通过类名进行访问的。不依赖对象
 * 从内存存储来说，只有是否被static所修饰，被static修饰的都在方法区。
 * 其他的不是在栈上就是在堆上，取决于是不是成员变量或者是局部变量
 * 4.静态方法不在方法区，他是一个方法，静态方法的地址再方法区
 *5.成员变量在对象里面，对象地址再堆上
 */

class Person {

    public int age;
    public String name;
    public static int count;//类变量也叫静态变量，编译时已经产生，属于类本身，且只有一份，存放在方法区

    public final int SIZE = 10;//被final修饰的叫常量，也属于对象，被final修饰，后期不能修改

    public static final int Count = 99; //静态常量，属于类本身，只有一份

    public void eat() {
        int a = 10;//局部变量，存放于栈
        System.out.println("吃饭");
    }

    public void show() {
        System.out.println("我叫"+name+"今年"+age +"岁了");
    }

}


public class TestClass {

    /**
     * 交换两个变量的值
     * @param myValue 对应主函数中定义的第一个变量，
     * @param myValue1  对应主函数中定义的第二个变量 他俩类型都是MyValue
     *                  两个形参都是引用类型
     */
    public static void swap(MyValue myValue,MyValue myValue1) {

        int tmp = myValue.val;
        myValue.val = myValue1.val;
        myValue1.val = tmp;

    }

    public static void main(String[] args) {

        MyValue myValue = new MyValue();
        myValue.val = 10;
        MyValue myValue1 = new MyValue();
        myValue1.val = 20;

        System.out.println(myValue.val + " " +myValue1.val);

        swap(myValue,myValue1);

        System.out.println(myValue.val + " " +myValue1.val);
    }

    public static void main1(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.age = 10;
        p1.name = "顾陌";
        p1.show();

        Person.count = 100;
        System.out.println(Person.Count);
        System.out.println(Person.count);
    }
}

class MyValue {

    public int val;
}
