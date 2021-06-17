package Test0617;


/**
 * 构造方法：没有返回值，且方法名和类名是一样的
 * 一、一个对象的产生，需要分为几步：
 * 1.为对象分配内存，地址，引用，所以this代表当前对象的引用
 * 2.调用合适的构造方法（构造方法不止一个）
 * 调用完构造方法后，对象才真正的存在了
 *
 * 二、
 * 1、当你在类当中没有写任何的构造方法的时候，编译器会自动为你提供一个
 * 不带有参数的构造方法，这个方法什么都没做
 * 2、当你在类中，写了其他的构造方法，那么编译器就不会为你自动生成默认的构造方法
 *
 * 三、构造器方法是否可以发生重载？？
 *可以发生重载
 * 重载：1.方法名相同2.参数列表不同3.返回值不做要求4.在一个类当中
 *
 * 四、this关键字
 * this代表当前对象，错误的，因为对象的产生分为两步，第一步为对象分配内存，就是地址，就是引用
 * 第二部调用合适的构造方法，调用完之后才能说则个对象真正的存在了，但是在构造方法中就出现了
 * this关键字，所以this关键字代表当前对象的引用
 * this关键字功能
 * 1、this.成员变量  成员变量一定是普通的成员变量不能是静态的成员变量
 * 2.this()  构造方法里面调用构造方法
 * 3、this.成员方法   成员方法里面调用成员方法同上
 */

/*
 * 对象转换为字符串叫做序列化，反之叫反序列化
 */

/**
 * 代码块
 * 1、本地代码块
 * 2、实例代码块也叫构造代码块
 * 3、静态代码块(只会执行一次)
 * 运行顺序：静态代码块  实例代码块  构造方法
 * 注意：同是static情况下，（静态变量与静态方法）看定义的先后顺序，
 * 可以理解为静态先加载，帮助理解，但不准确
 */

class Student {
    public int age;
    public String name;

    {
        //作用，一般情况下初始化成员变量
        this.name = "顾奈";
        System.out.println("实例代码块  也叫构造代码块");
    }

    static {

        //this.age = 10;
        //静态的代码块也是不依赖于对象的，但是age依赖于对象，所以不能初始化
        System.out.println("静态代码块");
    }


    public Student() {//空构造方法，没有任何参数

        //this调用构造方法必须写在第一行
        this("顾");//空构造方法调用带有一个参数的构造方法，且这个参数是String
        System.out.println("空构造方法");

    }

    public void fun() {

        fun2();
        this.fun2();//this方法里面调用方法
        //两个是一样的
        System.out.println("fun（）");
    }

    public void fun2() {

        {
            System.out.println("本地代码块，没什么乱用");
        }
        System.out.println("fun2()");
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("年龄，名字");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class ConstructorTest {


    public static void fun4(Student student) {

    }


    public static void fun5(int[] array) {

    }

    /**
     * 可变参数编程
     * @param b 可变的参数
     * @return  返回一个整形
     */
    public static int fun6(int... b) {
        int sum = 0;
        for(int i = 0;i<b.length;i++) {
            sum += b[i];
        }
        return sum;

}

    public static void main(String[] args) {



        //非匿名数组，正常调用
        int[] array = {1,2,3,4};
        fun5(array);

        //匿名数组
        fun5(new int []{12,3,4});

        //可变参数调用
        System.out.println(fun6(array));
        System.out.println(fun6(1,2,3,4,4,5));//也可以在这里输入想要传过去的数组
    }
    public static void main2(String[] args) {
        //匿名对象：优点：只使用一次
        //缺点：每次用的时候都要new对象
        //匿名对象，每次调用都要new一个开辟内存
        new Student().fun();
        fun4(new Student());

        //非匿名对象,只new一次
        Student student = new Student();
        student.fun();
        fun4(student);
        
    }


    public static void main1(String[] args) {
        Student student = new Student();
        //这一条语句会打印空构造方法里面的输出语句

        System.out.println(student);
//
//        student.age = 10;
//        System.out.println(student.age);//10
//        student.setAge(10);
//        System.out.println(student.getAge());//10
//
//        student.name = "顾陌";
//        System.out.println(student.name);//顾陌
//        student.setName("顾陌");
//        System.out.println(student.getName());//顾陌
//
//
        Student student1 = new Student(22,"顾奈");
        System.out.println(student1.getName());//顾奈
        System.out.println(student1.getAge());//22

    }
}


