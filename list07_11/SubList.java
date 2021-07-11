package list07_11;

import java.util.ArrayList;
import java.util.List;

public class SubList {

    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println(list);
        //[A, B, C, D, E, F]

        System.out.println(list.subList(1, 4));
        //[1,4) 左闭右开区间[B, C, D]不影响原来的线性表

        System.out.println(list);//[A, B, C, D, E, F]
    }
}
