package test525;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortTest {

    public static void main(String[] args) {

        int[] arr = {12,23,65,87,90,14,35,36,52};
        bubberSort(arr);
        selectSort(arr);

    }


    //冒泡排序

    //冒泡排序的思想是:使用数组中从第一个元素开始，相邻的两个元素进行比较，
    // 把大的或小的放在后一个位置，然后依次往后进行比较，一次比较完，
    // 最后一个就是这个数组中最大或最小的数，然后又从第一个元素开始，
    // 相邻元素进行比较，结果会把剩下的元素中最大的或最小的数放在倒数第二个位置上，
    // 依此类推，就可以把数组按照从小到大或从到小进行排序


    public  static void bubberSort(int[] arr){
        for (int i = 0; i <arr.length - 1; i++) {
            for (int j = 0; j <arr.length - 1 - i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;//两两比较，把最大的一个放到末尾

                }

            }

        }
        System.out.println("冒泡排序：" + Arrays.toString(arr));
    }

    //选择排序

    //选择排序的思想是:使用数组中的第一个元素，与数组中它后面的元素进行比较，
    // 把最大的或最小的放在第一位，一圈比完后，拿第二个元素跟后面的元素比，
    // 把最大的或最小的放在第二位；依此类推，就可以把数组按照从小到大或从到小进行排序
    public static void selectSort(int[] arr){
        for (int i = 0; i <arr.length - 1 ; i++) {
            for (int j = 0; j <arr.length - 1; j++) {
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;//拿第一个元素去比较，跟把最小的放在第一位
                }

            }

        }
        System.out.println("选择排序：" + Arrays.toString(arr));

    }
}
