package test;

/**
 * 内部类
 * 静态内部类
 * 实例内部类
 * 本地内部类（基本不会使用的）
 * 匿名内部类
 */
class OuterClass {
    public int data1 = 999;
    private int data2;
    public static int data3;

    public void func() {
        //static int a = 10;  error
    }


    /**
     *实例化内部类：你可以把它看做是外部类的实例的成员/方法
     * 1.实例内部类当中，是不可以定义静态的成员变量的
     * 但是 如果非要定义，那么只有一个方法
     * public static final  此时定义的变量如果是静态的，
     * 一定是要在编译的时候就要确定其值的
     * 2.如何实例化内部类对象
     * OuterClass外部类对象的引用
     * OuterClass.InterClass interClass = outerClass.new InterClass();
     *
     * 3.如何访问和外部类同名的属性？
     * 面试问题：实力内部类，是否有额外的开销
     * 实例化内部类当中，包含了外部类的this引用
     * 对于this来说，相当于是一个静态的引用
     */

    class InterClass {
        public int data1 = 100;
        public int data4;
        private int data5;
        public static final int data6 = 10;

        public void func2() {
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println(OuterClass.this.data1);
        }

    }
}
public class TestDemo1 {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.InterClass interClass = outerClass.new InterClass();

        interClass.func2();
    }
}
