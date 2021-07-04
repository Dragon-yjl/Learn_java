package exception;

public class ExceptionTest {

    public static int testFinally () {
        int a = 10;
        try {
            return 4;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            //return a;
            System.out.println("在finally当中不要写return，他只是最后被执行，主要用来释放资源");
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(testFinally());
    }

    public static void main9(String[] args) {

        int[] arr = {1,23,1};
        try {
            System.out.println(arr[1]);
            System.out.println("继续执行");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();;
            System.out.println("数组越界异常");
        } finally {//一定会被执行，主要用来释放资源，关闭文件，关闭socket链接等等
            System.out.println("我是finally");
        }
    }

    public static void main2(String[] args) {

        int[] arr = {1,2,3};
        try {
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");//不会打印
        } catch (ArrayIndexOutOfBoundsException e) {
            //打印出现问题的调用栈
            e.printStackTrace();;
        }

        System.out.println("after try catch");
    }


    public static void main11(String[] args) {

        System.out.println(10/0);//ArithmeticException
        //代码在这里如果发生异常，但是程序没有捕获异常，
        //那么这个异常就会交给JVM来处理
        //一单交给JVM来处理，程序就会立马异常终止
        System.out.println("hi");
    }

    public static void main0(String[] args) {

        try {
            System.out.println(10/0);
            //如果这里捕获到了相应的异常，就会执行catch里面的代码
        }catch (ArithmeticException e) {
            System.out.println("捕获到了算数异常");
        }
        System.out.println("hi");

    }
}
