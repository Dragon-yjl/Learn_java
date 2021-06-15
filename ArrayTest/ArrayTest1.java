package ArrayTest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest1 {

    /*
    定义一个未初始化数组，然后给这个数组自己赋值输出
     */
    public static void main(String[] args) {

        int[] array = new int[3];
        Scanner scan = new Scanner(System.in);
        for(int i =0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 二分查找
     * @param array 数组必须有序
     * @param key 你要找的值
     * @return 找到之后返回数组下标
     */

    public static int binarySearch(int[] array,int key) {
        if(array == null || array.length == 0) {
            return -1;
        }
        int left= 0;
        int right = array.length-1;

        while (left <= right){
            int mid = left + (right-left)/2;//这一句一定要写进while循环，写外面会造成死循环
           if(array[mid] > key) {
               right = mid -1;
           }else if(array[mid] < key) {
               left = mid +1;
           }else {
               return mid;
           }
        }
        return -1;

    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,10,5,6,7,8,9,4};
        //如果数组是无序的，先给数组排序
        Arrays.sort(array);
        System.out.println(binarySearch(array,10));

        //也可以直接调用Array.binarySearch(array,10);

        int index = Arrays.binarySearch(array,4);
        System.out.println(index);
    }

    /**
     * 输入一个值，在数组中查找，找到返回下标
     * @param array  int [] array
     * @param key 你要找的值
     * @return 返回数组下标
     * 查找的数据正好在最后，一旦数据量变大了，查找的时间就会变慢
     */

    public static int findIndex(int[] array,int key) {
        if(array == null || array.length == 0) {
            return -1;
        }
        for(int i =0;i<array.length;i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;//没找到，返回-1
    }

    /**
     * 输入一个数组，求数组里面最大值
     * @param array int[] array
     * @return 返回一个最大值
     */
    public static int maxArray(int[] array) {

        if(array == null || array.length == 0) {
            return -1;
        }
        int max = 0;//int max = array[0];
        for(int i = 0;i<array.length;i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 求一个数组的平均值
     * @param array int[] array
     * @return 返回平均值可能是小数
     */
    public static double averageArray(int[] array) {

        if(array == null || array.length == 0) {
            return -1;
        }
        double ave = 0;
        int sum = 0;//或double sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum += array[i];
            ave = sum*1.0/ array.length;
        }
        return ave;
    }

    public static void main1(String[] args) {

        int[] array = {1,90,3,4,5,6,7,8,9,10,11,55};
        int max = maxArray(array);
        System.out.println(max);

        double ave = averageArray(array);
        System.out.println(ave);

        int dex = findIndex(array,55);
        System.out.println(dex);
    }
}
