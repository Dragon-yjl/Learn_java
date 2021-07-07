package GenericMethod7_7;

import java.lang.reflect.GenericArrayType;

public class GenericTest {

    /*
    public static void method(T a) {}
    错误的，没有定义T

     */

    /*
    public static <T> void method() {}
    对的，定义了未使用，只是一个警告
     */

    /*
    public static  <X> void method(T a, T b) {}
    错误的，定义的是X，却使用了T  T没有定义
     */

    /*
    public static <X> void method(X a,X b) {}

    public static void main(String[] args) {
//        GenericTest.<X>method(a,b);
        //错误的 X是不存在的

    }

     */

    public static <X> void method1() {}

    public static <Y> void method2() {
        GenericTest.<Y>method1();

    }

    public static <Z> void method3() {
        GenericTest.<Z>method2();

    }

    public static void useMethod3() {

        GenericTest.<String>method3();
    }
}

