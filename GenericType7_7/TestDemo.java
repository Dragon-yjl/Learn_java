package GenericType7_7;


import java.lang.annotation.Target;
import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.Comparator;

public class TestDemo {

    public static void bubbleSort(int[] array) {
        for(int i = 0;i<array.length-1;i++) {
            boolean flg = true;
            for(int j = 0;j<array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = false;
                }

            }
            if(flg) break;
        }
    }


    //方法的重载
    public static <T> void bubbleSort (T[] array, Comparator<T> comparator) {

        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0;j<array.length-i-1; j++) {
                //T现在是引用类型  是Teacher类
                //所以传入比较对象方法

                int r = comparator.compare(array[j],array[j+1]);
                if(r > 0) {
                    //代表array[j] 指向的对象，大于 array[j+1] 指向的对象
                    T tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                 }
            }
        }

    }


    public static void main1(String[] args) {

        int[] array = {23,74,96,21,879,1,39,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {

        //Teacher[] teacher = new Teacher[10];

        Teacher[] teacher = {
                new Teacher("张三",18,180),
                new Teacher("李四",34,190),
                new Teacher("王麻子",16,200),
                new Teacher("顾陌",16,170)};

        System.out.println("排序之前");
        System.out.println(Arrays.toString(teacher));

        Comparator<Teacher> byAge = new TeacherByAgeComparator();
        Comparator<Teacher> byHeight = new TeacherByHeightComparator();
        Comparator<Teacher> byName = new TeacherByNameComparator();

        System.out.println("排序之后");

        //完整写法，传入Teacher表示方法定义时T就是Teacher类型
        TestDemo.<Teacher>bubbleSort(teacher,byAge);

        System.out.println("按年龄排");
        System.out.println(Arrays.toString(teacher));
        //如果没有实现toString方法，打印出来的全是地址

        //编译器有能力算出来这里的T就是Teacher类型
        TestDemo.bubbleSort(teacher,byHeight);

        System.out.println("按身高排");
        System.out.println(Arrays.toString(teacher));

        //因为在本类中调用，所以类名也可以省略
        bubbleSort(teacher,byName);

        System.out.println("按名字排");
        System.out.println(Arrays.toString(teacher));
    }

}
