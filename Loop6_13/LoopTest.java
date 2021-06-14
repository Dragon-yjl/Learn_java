package Loop6_13;

import java.util.Random;
import java.util.Scanner;

public class LoopTest {

    public static void main(String[] args) {

        //打印 1--100之间所有的素数

        int j = 2;
        int i = 1;

        for(i = 1; i < 100;i++) {
            for(j = 2;j < i;j++) {
                if(i % j == 0) {
                    break;
                }
            }
            if(i == j) {
                System.out.print(" " +i + " ");
            }
        }
    }


    public static void main23(String[] args) {

        //判断一个数字是否为素数

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int i = 2;
        for(;i < num; i++) {
            if(num % i == 0) {
                System.out.println( num +"不是素数");
                break;
            }

        }
        if(num == i) {
            System.out.println(num + "是素数");

        }
    }
    public static void main90(String[] args) {

        //猜数字游戏
        //随机生成一个数字

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int random = rnd.nextInt(100) + 1 ;// 表示[1-100)随机//next Int(100)表示[0-99)

        while (true) {
            System.out.println("请输入你要猜的数字！");

            int n = scan.nextInt();
            if(n < random) {
                System.out.println("猜小了！");
            } else if( n == random) {
                System.out.println("猜对了！");
                break;
            } else {
                System.out.println("猜大了！");

            }
        }
    }

    public static void main56(String[] args) {

        //循环输入一个数字一直打印
        Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();

        while(scan.hasNextLine()){
            int n = scan.nextInt();
        System.out.println(n);
        }
    }

    public static void main121(String[] args) {

        Scanner sca = new Scanner(System.in);

        int n = sca.nextInt();
        System.out.println(n);

        String str = sca.nextLine();//吧nextLine()换成nextIne(),就可以先输入数字打印，在输入字符串打印
        System.out.println(str);
        /*
        如果nextLine()在前面，就可以先输入一个字符串，打印完在输入一个整数在打印
        但是如果nextInt()在前面，当你输入一个数字就会打印一个数字，然后直接运行结束
        如果吧nextLine()换成nextInt(String)，先输入一个数字打印，然后可以输入字符串打印，但只能打印不带空格的字符串


         */

//        Scanner sca = new Scanner(System.in);
//        String str = sca.nextLine();//可以打印用空格隔开的字符串，比如gmo is  cool
//        String str1 = sca.next();//遇到空格就结束了，只能打印一个字符串，比如打印gmo is cool 只能打印gmo
//        System.out.println(str);

    }

    public static void main1(String[] args) {
        System.out.println("请输入一个数：");
        Scanner Scanner  = new Scanner(System.in);
        int num = Scanner.nextInt();

        //输入一个数，求它所有阶乘之和

        int sum = 0;
        for(int j = 1;j<=num;j++) {
            int ret = 1;
            for (int i = 1; i <= j; i++) {
                ret *= i;

            }

            sum += ret;
        }
        System.out.println(sum);
    }
}
