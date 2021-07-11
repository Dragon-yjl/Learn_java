package list0711;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[] sArray = {"hello","world","中国"};

        //strings 的底层实现不是ArrayList
        List<String> strings = Arrays.asList(sArray);
        System.out.println(strings);//[hello, world, 中国]
        System.out.println(strings.getClass());
        //class java.util.Arrays$ArrayList
    }
}
