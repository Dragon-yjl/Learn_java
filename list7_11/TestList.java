package list7_11;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("Im");
        list.add("顾陌");

        System.out.println(list);//[hello, Im, 顾陌]

        list.add(2,"顾奈");//

        System.out.println(list);//[hello, Im, 顾奈, 顾陌]

        list.remove(2);

        System.out.println(list);//[hello, Im, 顾陌]

        list.remove("Im");
        System.out.println(list);//[hello, 顾陌]

        System.out.println(list.get(1));//顾陌

        list.set(0,"hi");
        System.out.println(list);//[hi, 顾陌]

        System.out.println(list.size());;//2

        System.out.println(list.isEmpty());//false
        list.clear();
        System.out.println(list.isEmpty());//true

        System.out.println(list.contains("Im"));//false


    }
}
