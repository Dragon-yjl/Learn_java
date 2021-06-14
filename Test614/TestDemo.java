package Test614;

import java.awt.image.RescaleOp;
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {

        //二进制序列分别输出奇数位和偶数位上的值

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 31; i>=1;i-=2) {//i-=2每隔两位移一次
            //移·31位在&1等于拿到第一个偶数位值
            System.out.print(((num >> i) & 1) + " ");
        }

        System.out.println();
        System.out.println("******************************");

        for(int i = 30; i>=0;i-=2) {
            System.out.print(((num >> i) & 1) + " ");
        }
    }

    public static void main15(String[] args) {

        //二进制有几个1 进阶，优化
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int count = 0;
        while (num!=0) {
            count++;
            num = num & (num - 1);
            //有几个1与几次，提高效率
        }
        System.out.println(count);
    }

    public static void main14(String[] args) {

        //二进制里面有几个1
        //右移运算符操作,极端情况下要循环32次
         Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();

         int count = 0;
         for(int i = 0;i < 31;i++) {
             if(((num >> i) & 1) != 0) {//加括号防止 优先级
                 count++;
             }
         }
        System.out.println(count);

    }
    public static void main13(String[] args) {

        //逆序输出整数每一位
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (num!=0) {
            System.out.print(num%10+" ");//先打印个位数
            num /= 10;
        }
    }
    public static void main12(String[] args) {

        //三次机会输入密码

        int count = 3;
        Scanner scan = new Scanner(System.in);

        while (count!=0) {
            System.out.println("请输入你的密码：");
            String password = scan.nextLine();
            //if(password == "123") {//不能用这种方式比较两个字符串大小
            if(password.equals("123")) {
                System.out.println("登陆成功！");
                break;
            }else {
                count--;
                System.out.println("密码错误，你还有"+count+"次机会！");
            }
        }
    }

    public static void main11(String[] args) {

        //水仙花数
        //输入一个数，判断从1-num所有的水仙花数
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 0;i<=num;i++) {
            //1.判断输入的数字是几位数
            int tmp = i;//先保存i的值，如果用i求，求几位数的时候最后会变成0
            int count = 0;
            while(tmp!=0) {
                count++;
                tmp = tmp/10;
            }//当代码进行到这说明tmp已经为0
            tmp = i;
            int sum = 0;
            //2.求tmp的每一位，并且计算幂和
            while (tmp!=0) {
                sum += Math.pow(tmp%10,count);//(x,y)/表示x的y次方
                //+=这个运算符可以自动进行类型转换
                //如果用sum= sum+ ···就会报错
                tmp = tmp/10;
            }//程序进行到这tmp为0
            if(sum == i) {
                System.out.println(i);
            }


        }
    }
    public static void main8(String[] args) {

        //判断1-100有几个9
        //i/10 == 9 十位数上是9, 90，91,92--99
        //i%10 == 9  个位数上是9, 9,19,29，---89,，99
        //99被计入两次
        int count = 0;//计数器
        for(int i = 1;i<=100;i++) {

            if(i/10 == 9) {
                count++;
            }//不能是else if 这样99就只能被记入一次,结果为19
             if(i%10 == 9) {
                count++;
            }
        }
        System.out.println(count);//结果为20
    }

    public static void main7(String[] args) {

        //计算1/1-1/2+1/3-1/4+1/5 ····· +1/99-1/100的值
        //注意，减一次加一次
        double sum = 0.0;
        int flag = 1;
        for(int i = 1;i <= 100;i++) {
            sum += 1.0/i * flag;//如果用1/i*flag,运行结果为1.0
            // 因为用1/2等于0，后面都是0
            flag = -flag;
        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {

        //辗转相除法：a/b取余，余数不为0时，a = b;b = 余数,循环
        // 余数为0时，此时除数b就是最大公约数
        //求最大公约数

        int a = 90;
        int b = 24;
        int c = a%b;
        while(c!=0) {
            a = b;
            b = c;
            c = a%b;
        }
        System.out.println("最大公约数为"+b);
    }
    public static void main5(String[] args) {

        ////九九乘法表
        for(int i = 1;i <= 9;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print( i +"*"+j +"="+ i*j +"  " );

            }
            System.out.println();
        }
    }
    public static void main4(String[] args) {

        //打印1000--2000之间所有的闰年
        for(int i = 1000;i<=2000;i++) {
            if(i%4==0 && i%100 !=0 || i%200 ==0) {
                System.out.println(i+ "是闰年");
            }
        }
    }
    public static void main3(String[] args) {

        //判断一个数是否为素数 进阶
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int i = 2;
        for(;i <= Math.sqrt(num);i++) {//还可以是num/2但是效率比开方差一点
            if(num %i == 0) {
                System.out.println(num+"不是素数");
                break;
            }
        }
        //当代码走到这，有2种情况，要么break结束循环，要么是for循环结束了
        if(i > Math.sqrt(num)) {//可以是num/2
            System.out.println(num+"是素数");
        }
    }
    public static void main2(String[] args) {

        //输入一个年龄，判断是否为青老年

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if(age <= 18) {
            System.out.println("当前年龄段的人为少年");

        } else if (age >= 19 && age <=28) {
            System.out.println("当前年龄段的人为青年");

        }else if(age >= 29 && age <= 55) {
            System.out.println("当前年龄段的人为中年");

        } else {
            System.out.println("当前年龄段的人为老年");

        }
    }

    public static void main1(String[] args) {//args 运行时参数

        //遍历main函数中的String数组，运行结果为空
        for(int i = 0;i<args.length-1;i++) {
            System.out.println(args[i]);
        }
        System.out.println("Hello");
    }
}
