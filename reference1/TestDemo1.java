package reference1;

/**
 * java中提供了关于对象的比较  有以下方式
 *
 * 1.equals()
 * 所有的类都具备的能力
 * 理解：比较两个对象代表的是不是一个实际事物
 * 规则：需要重写equals方法来达到目的
 *
 * 2.大小的比较
 *
 * ①自然顺序  Comparable  compareTo()
 * 不是所有类都具备，需要通过实现Comparable 接口来表明该类具备这个能力
 * 理解：比较this与传入的引用所指的对象
 *
 * ②外部比较 （比较器） Comparator -- 构造一个天平
 * 不需要比较的类具备Comparable的能力
 * 理解：比较传入的两个引用指向的对象
 */

import java.util.Comparator;

class ByHeightComparator  implements Comparator <Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.height - o2.height;
    }
}

class ByWeightComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.weight - o2.weight;
    }
}

public class TestDemo1   {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("高博",18,190,80);
        Teacher t2 = new Teacher("张三",38,170,100);

        Comparator<Teacher> byHeight = new ByHeightComparator();
        Comparator<Teacher> byWeight = new ByWeightComparator();

        int ret ;

        //按照自然顺序，（我们实现的年龄）比较
        ret = t1.compareTo(t2);
        System.out.println(ret);//-1

        //按照身高比较
        ret = byHeight.compare(t1,t2);
        System.out.println(ret);//20
        //按照体重比较
        ret = byWeight.compare(t1,t2);
        System.out.println(ret);//-20

    }
}
