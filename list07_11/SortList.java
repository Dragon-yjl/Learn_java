package list07_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(5);
        list.add(5);
        list.add(1);

        System.out.println(list);
        //[3, 2, 6, 9, 5, 5, 1]

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
                //return 0的话就跟原来一样，顺序不变
            }
        });

        System.out.println(list);
        //return o1 - o2;从小到大排序
        //[1, 2, 3, 5, 5, 6, 9]


        //return o2 - o1;从大到小排序
        //[9, 6, 5, 5, 3, 2, 1]
    }
}
