package test6_14;

import java.util.Scanner;

public class TestDemo {

    public static int add(int a,int b) {
        int ret = a + b;
        return  ret;
    }

    /**
     * 两个数字交换
     * @param a
     * @param b
     */
    public  static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /**
     * 计算1！+2！+3！+····num阶乘的和
     * @param num
     * @return
     */
    public static int facSum(int num) {

        int sum = 0;
        for(int i = 1;i<=num;i++) {

            //计算每个数的阶乘
//            int ret  = 1;
//            for(int j = 1;j<=i;j++) {
//                ret *= j;
//
//            }
            //或
            int ret = fac(i);
            sum +=ret;
        }
        return sum;
    }

    /*
    求num的阶乘
     */
    public static int fac(int num) {
        int ret = 1;
        for(int i = 1;i<=num;i++) {
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
//        int sum = add(x,y);
        swap(x,y);
        System.out.println(x+" "+y);
//        System.out.println(sum);

//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int sum = facSum(num);
//        System.out.println(sum);
    }

}
