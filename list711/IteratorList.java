package list711;


/**
 * Iterator 迭代器
 * 1.foreach写法 本质上 其实本质上就是通过迭代器实现的
 * 换言之，凡是支持Iterator能力的容器，都可以使用foreach
 * 2.迭代器是相互独立的
 * 3.遍历的同时，不能修改它的结构，所以不能听你不过list去删除元素
 * 如果非要删除 要通过迭代器删除
 * 4.只能从前往后遍历
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");


        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next+" ");
        }
        System.out.println();        //上述写法 可以被foreach写法代替
        //foreach写法 本质上 其实本质上就是通过迭代器实现的
        //换言之，凡是支持Iterator能力的容器，都可以使用foreach
        for (String next : list) {
            System.out.print(next+" ");
        }

    }
}
