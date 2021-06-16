package Test6_17;


/**
 * 1.静态的方法和成员变量：通过类名调用，，不依赖于对象
 * 2.局部变量未初始化不能使用，打印会报错
 *   成员变量可以使用，实例化对象然后调用
 * 3、普通的成员方法内部，不能定义静态成员变量，但是可以方法
 */
class Test {
    public static void hello() {
        System.out.println("hello");
    }
}


public class StaticTest {
    public static void main(String[] args) {

        Test test = null;//如果类里面方法是非静态方法，
        // 运行结果就是空指针异常
        test.hello();//因为是静态方法，所以运行结果是hello
    }


}
