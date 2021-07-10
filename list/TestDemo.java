package list;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {

        List<String> list =  new ArrayList<>();

        list.add("Hello");
        list.add("Word");
        list.add("我是");
        list.add("中国人");
        list.add(4,"吃了么");


        System.out.println(list);
        //[Hello, Word, 我是, 中国人, 吃了么]


        list.remove(1);
        System.out.println(list);//[Hello, 我是, 中国人, 吃了么]

        list.remove("我是");
        System.out.println(list);//[Hello, 中国人, 吃了么]

        System.out.println(list.get(1));//中国人

        list.set(1,"韩国人");
        System.out.println(list);//[Hello, 韩国人, 吃了么]

        System.out.println(list.size());//3

        System.out.println(list.isEmpty());//false


//
//        String s = list.get(2);
//        System.out.println(s);//我是
//
//        list.set(4,"好的");
//        System.out.println(list);
//        //[Hello, Word, 我是, 中国人, 好的]
//
//        System.out.println(list.size());//5
//
//        list.clear();//清空
//        System.out.println(list);
//
//        System.out.println(list.isEmpty());//true
//        System.out.println(list.size());//0

    }
}
