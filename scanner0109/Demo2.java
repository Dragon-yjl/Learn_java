package com.yjl.scanner0109;

import java.util.Scanner;

public class Demo2 {
    /**
     * 输入多个数字求和与平均数
     * @param args
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double sum = 0; // 和
        int count = 0; // 计算输入了多少个字符
        while (s.hasNextDouble()) {
            double d = s.nextDouble();

            count ++;
            sum += d;

            System.out.println("你输入了第"+count+"个数据，、" +
                    "当前结果为"+sum);

        }

        double ave = sum / count;

        System.out.println("和"+sum);
        System.out.println("均值"+ave);
        System.out.println("个数"+count);

        s.close();

    }
}
