package Test6_15;

import javax.xml.bind.SchemaOutputResolver;

public class TestDemo1 {

    //递归  保护现场
    //1.调用自己本身
    //2.要有一个趋近于终止的条件

    //递归求5！
    public static int fac(int n) {
        if(n==1) {
            return 1;
        }
        return n* fac(n-1);
    }

    public static void main1(String[] args) {

        System.out.println(fac(5));
    }

    public static void func(int n) {
       while (n!=0) {
           int a = n%10;
           System.out.println(a);
           n /=10;
       }


    }

    /**
     * 输入1234递归输出1 2 3 4
     * @param n
     */
    public static void fun(int n){
        if (n > 9){
            fun(n/10);
        }
        System.out.print(n%10+" ");

    }
    //回来的时候吧sout都执行一遍

    public static void main12(String[] args) {
        int n = 1234;
       fun(n);
    }

    /**
     * 求1+2+3+4+·····+n
     * @param n
     * @return
     */
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }

        return n+sum(n-1);
    }

    public static void main13(String[] args) {

        System.out.println(sum(10));
    }

    /**
     * 输入数字1729,输出各个数字之和
     * @param n
     * @return
     */

    public static int add(int n) {
        if(n<10) {
            return n;
        }

        return n%10 +add(n/10);
    }

    public static void main(String[] args) {

        System.out.println(add(1729));
    }
}
