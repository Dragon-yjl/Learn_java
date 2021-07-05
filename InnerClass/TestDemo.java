package InnerClass;


/***
 * 内部类：
 * 静态内部类
 * 实例内部类
 * 本地内部类
 * 匿名内部类(基本不会使用的)
 */

class OutClass {
    public int data1 = 999;
    private int data2;
    public static int data3;

    public void func() {

    }

    /**
     * 实例内部类:可以看做是外部类的实例的成员
     * 1.实例内部类中，是不可以定义静态的成员变量的
     * 但是，如果非要定义，那么只有一个办法
     * public static final int data6 = 10;必须初始化
     * 此时定义的变量如果是静态的，一定是在编译的时候就要确定其值的
     * 2.如何实例化内部类对象
     *  OutClass：外部类对象引用
     *  OutClass.InterClass interClass = outClass.new InterClass();
     *
     * 3.如何访问和外部类同名的属性
     *  面试问题：实例内部类 是否有额外的开销
     *  实例内部类当中 包含了外部类的this引用
     *  可以用OutClass.this.data1访问
     *  其实this这个关键字，相当于一个静态的引用
     *  4.实例内部类
     *  实例内部类生成的字节码文件：外部类$内部类.class
     *
     */
    class InterClass {
        public int data1 = 100;
        public int data4;
        private int data5;
        public static final int data6 = 10;

        public void func2 () {
            System.out.println(data1);//100
            System.out.println(this.data1);//100
            System.out.println(OutClass.this.data1);//999
//            System.out.println(data2);
//            System.out.println(data3);
//            System.out.println(data4);
//            System.out.println(data5);
//            System.out.println(data6);
        }

    }
}


public class TestDemo {

    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        OutClass.InterClass interClass = outClass.new InterClass();

        interClass.func2();
    }
}
