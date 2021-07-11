package list0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        //第一种
//        Object[] objects = list.toArray();
//        for (Object o : objects) {
//            String s = (String) o;
//            System.out.print(s+" ");//A B C D E F
//        }
//        System.out.println();

        //第二种

//        String[] strings = list.toArray(new String[0]);
//        for(String s : strings) {
//            System.out.print(s+" ");//A B C D E F
//        }


        //数组容量 < list.size()
//        String[] sArray = new String[1];
//        sArray[0] = "hello";
//        String[] strings = list.toArray(sArray);
//        //当转化的数组长度小于list长度，就会重新给一个数组看空间来储存
//        System.out.println(Arrays.toString(sArray));//[hello]
//        System.out.println(Arrays.toString(strings));//[A, B, C, D, E, F]
//        System.out.println(sArray == strings);///false
//        //虽然是吧sArray转化为数组，但是长度小于list长度，所以分配了一个额外的空间储存这个数组
//


        //数组容量 == list.size()
        String[] sArray = new String[6];
        String[] strings = list.toArray(sArray);
        System.out.println(Arrays.toString(strings));//[A, B, C, D, E, F]
        System.out.println(Arrays.toString(sArray));//[A, B, C, D, E, F]
        System.out.println(sArray == strings);//true


        //数组容量 > list.size()
//        String[] sArray = {"1","2","3","4","5","6","7","8"};
//        String[] strings = list.toArray(sArray);
//
//        System.out.println(Arrays.toString(sArray));
//        //[A, B, C, D, E, F, null, 8]
//        System.out.println(Arrays.toString(strings));
//        //[A, B, C, D, E, F, null, 8]
//        System.out.println(sArray == strings);//true
    }
}

