package ArrayList7_10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 线性结构：逻辑上具备前后关系的一组数觉得集合
 * 顺序表:逻辑上是线性结构，同时物理存储上也是顺序的
 * 顺序表 ArrayList（类）  实现了List（接口） 线性表
 * 从java语法角度：List是接口，ArrayList是类，实现了List
 * 从数据结构角度：List表示线性表，ArrayList表示顺序表
 *               通过ArrayList实现List接口，表达了顺序表
 *               是一种线性表
 *
 */
public class TestDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,4,1,5,9,2,6));

        //list.remove(3);//[3, 1, 4, 5, 9, 2, 6]
        //list.remove((Integer) 3);//[1, 4, 1, 5, 9, 2, 6]

        list.remove("9");//语法正确，可以执行，但是9没有被删除
        System.out.println(list);
    }
}
