package OOP6_30;

import java.util.Date;
//package java.util;包
import java.util.Arrays;//导入包下的类
import java.util.*;//导入包下所有的类

public class TestDemo {

    public static void main(String[] args) {

        int[] array = {9,2,3,4,5};

        Arrays.sort(array);

        String str = java.util.Arrays.toString(array);

        System.out.println(str);

        //自己手动导包
        java.util.Date date = new java.util.Date();

        //得到一个毫秒级别的时间戳
        System.out.println(date.getTime());

        //导入包以后
        Date date1 = new Date();

        System.out.println(date1);
    }
}
