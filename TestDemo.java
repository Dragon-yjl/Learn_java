package Bite6_12;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {

        //找到1-100之间所有能被5整除的数组
        int i = 1;
        while (i<=100) {
            if(i % 5 != 0) {
                i++;
                continue;//结束本次循环

            }
            //i++;不能光吧i++放到这个地方，continue会让循环执行不到这个地方，形成死循环
            System.out.println(i);//先打印，在++
            i++;
        }
    }

    public static void main32(String[] args) {

        //找到1-10之间第一个被5整除的数字
        int i = 1;
        while (i < 10) {
            if(i%5 == 0) {
                System.out.println(i);
                break;//结束循环,循环直接被干掉了
            }
            i++;
        }
    }

    public static void main11(String[] args) {
        //输入一个数，求他阶乘之和

        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = 0;
        int a = 1;

       while(a <= num) {
            int i = 1;
            int ret = 1;
            while (i <= a) {//不可以是 i<=num 这样就会每次计算num、阶乘然后加num次，应该第一次求1阶乘，第二次求2阶乘，然后相加
                ret *= i;
                i++;
            }
            sum += ret;
            a ++;
        }
        System.out.println("阶乘之和为：" + sum);

    }

    public static void main13(String[] args) {

        System.out.println("请输入一个数：");
        //输入一个数，计算阶乘
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int i = 1;
        int ret = 1;
        while (i <= num) {
            ret *= i;
            i++;
        }
        System.out.println("这个数的阶乘是：" + ret);
    }
    public static void main12(String[] args) {

        //输入一个数，计算这个数以内的和
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while (i<num) {
            i++;
            sum += i;
        }
        System.out.println("所有数的和" + sum);
    }

    public static void main5(String[] args) {

        //输入一个数，计算所有比他小的偶数的和
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 2;
        int eve = 0;//偶数

        while (i<=num) {
            eve += i;
            i += 2;

        }
        System.out.println("num以内偶数的和" + eve);
    }

    public static void main3(String[] args) {

        //计算100以内奇数的和
        int num = 0;
        int sum = 0;
        while (num <= 100) {
            if(num%2 != 0) {
                System.out.print(num + " ");
                sum += num;
            }
            num ++;


        }
        System.out.println();
        System.out.println("100以内奇数的和"+sum);
    }

    public static void main0(String[] args) {

        int num = 0;//循环变量的初始值
//        while (num > 0) {//循环变量的改变
//            System.out.print(num + " ");
//            num --;//循环变量的不步进
//        }//10 9 8 7 6 5 4 3 2 1
        while (num < 11) {
            System.out.print( num + " " );
            num ++;
        }//0 1 2 3 4 5 6 7 8 9 10
    }


    public static void main2(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        //switch 的参数最大只能是整型，只能是4个字节，不能是long，8个字节，只能是byte short int
        //char 也可以，字符型
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("既不是1也不是2");
                break;
        }
    }

    public static void main1(String[] args) {

        System.out.println("请输入年份：");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year%4 ==0 && year%100 != 0 || year%400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println( year + "不是闰年");
        }
    }
    public static void main6(String[] args) {

//        Scanner scanner  = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        if(num % 2 ==0) {
//            System.out.println( num + "是偶数！");
//
//        } else {
//            System.out.println(num + "不是偶数！");
//        }


        System.out.println("请输入一个数字:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        if(num < 0) {
            System.out.println(num + "是负数");
        } else if(num > 0) {
            System.out.println( num + "是正数");
        } else {
            System.out.println(num + "既不是正数也不是负数");
        }
    }
}
