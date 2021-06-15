package Demo;

import java.util.Arrays;


public class ArrayTest {

    /**方法一
     * 写一个方法，将数组中每个元素乘以2
     * @return 返回这个新数组
     * 改变了原来的数组
     */

    public static int[] arr(int[] array) {
        for (int i =0;i<array.length;i++) {
            array[i] *= 2;

        }

        return array;
    }

    /**方法二：
     * 不改变这个数组，定义一个新数组，让新数组乘以二
     * @param array 原先数组没变
     * @return  临时数组
     */
    public static int[] arr1(int[] array) {
        int[] tmp =new  int [array.length];

        for(int i =0;i<array.length;i++) {
            tmp[i] = array[i]*2;
        }
        return tmp;
    }

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};
        //System.out.println(Arrays.toString(arr(array)));//[2, 4, 6, 8, 10, 12]
        System.out.println(Arrays.toString(arr1(array)));//[2, 4, 6, 8, 10, 12]
    }


    /**
     * 返回一个数组
     * @return  return一个数组
     */

    public static int[] fun() {
        int[] array = {1,2,3};
        return array;
    }

    public static void main6(String[] args) {
        System.out.println(Arrays.toString(fun()));
    }


    /**
     * 打印数组
     * 传地址 传引用
     * @param array2
     */
    public static void print(int [] array2) {
        array2[0] = 999;///只要在这改变了数组，就算在主函数中打印，数组元素也已经发生了改变
        for (int i = 0;i<array2.length;i++) {
            System.out.print(array2[i]+" ");//999 2 3 4 5 6 7
        }
    }

    public static void main11(String[] args) {
        int [] array= {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(array));//[1, 2, 3, 4, 5, 6, 7]
        print(array);

        for (int i =0;i<array.length;i++) {
            System.out.print(array[i]+ " ");//999 2 3 4 5 6 7

        }
    }

    //数组也属于引用类型

    public static void main12(String[] args) {
        int [] array = {1,2,3,4,5};
        for(int i = 0;i<=array.length;i++) {//不能<=只能<array.length
            //ArrayIndexOutOfBoundsException数组下标越界
            System.out.print(array[i] + " ");
        }
        System.out.println();

        array = null;//也属于对象，空对象
        System.out.println(array.length);//NullPointerException空指针异常
    }

    //定义数组时，初始化的时候不能再[]中写长度（具体数字）

    //存放一类相同类型的数据
    //java当中数组，都是在堆上开辟内存
    int [] array = {1,2,3,4,5};
    int [] array1 = new int[4];//定义一个数组，未初始化,数组里面都是0
    int [] array2 = new int[] {1,2,3};//后面[]中也不能写数字

    public static void main1(String[] args) {

        int [] array = {1,2,3,4,5};
        for(int i = 0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        ///或第二种打印数组


        for(int x : array) {
            System.out.print(x+ " ");
        }
        System.out.println();

        //将数组以字符串形式进行输出

        String str = Arrays.toString(array);
        System.out.println(str);//[1, 2, 3, 4, 5]
        System.out.println();

        System.out.println(Arrays.toString(array));//[1, 2, 3, 4, 5]
    }

}
