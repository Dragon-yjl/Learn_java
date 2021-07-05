package InnerClass;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 *
 */

class OutClass2 {
    public int data1 = 999;
    private int data2;
    public static int data3;

    /**
     * 静态内部类:静态的数据成员
     * 1.如何实例化静态内部类对象 因为是静态，不需要new一个外部类
     *   OutClass2.InterClass2 interClass2 = new OutClass2.InterClass2();
     * 2.静态内部类是不能够访问外部类的实例数据成员的，可以访问静态成员
     *  非要访问的话
     *  思路：只要提供给他外部类的对象的引用就好了
     */

    static class InterClass2 {
        public int data1 = 100;
        public int data4;
        private int data5;
        public static int data6 = 10;

        OutClass2 out;

        public InterClass2(OutClass2 o){
            this.out = o;

        }

        public void func() {
            //System.out.println(data1);error
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data6);
            System.out.println(data1);
            System.out.println(this.out.data1);

            System.out.println("静态内部类：func()");
        }
    }
}

public class TestDemo1 {

    public static void main(String[] args) {

        OutClass2.InterClass2 interClass2 = new OutClass2.InterClass2(new OutClass2());

        interClass2.func();
    }

}
