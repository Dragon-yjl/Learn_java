package TestDemo08_02;

import java.util.Date;

public class DataTest {


    public static void main(String[] args) {
        //传入long类型的数字 便是1970年经过了100000毫秒后到达的时间
        java.util.Date d1 = new java.util.Date(1000000);
        java.sql.Date d2 = new java.sql.Date(1000000);

        //无参的构造方法 代码执行时 当前的时间
        java.util.Date d3 = new java.util.Date();

        System.out.println(d1);//Thu Jan 01 08:16:40 CST 1970
        System.out.println(d2);//1970-01-01
        System.out.println(d3);//Mon Aug 02 11:31:02 CST 2021


    }
}
