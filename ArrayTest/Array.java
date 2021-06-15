package ArrayTest;

import javax.swing.border.CompoundBorder;
import java.util.Arrays;

public class Array {


    /**
     * 冒泡排序优化
     * @param array int[] array
     */
    public static void bubbleSort(int[] array) {

        for(int i = 0;i<array.length-1;i++) {
            boolean flag = false;// 标记
            for(int j = 0;j<array.length-i-1;j++) {
                if(array[j]>array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {//if(flag == false)
                break;
            }
        }

    }

    public static void main(String[] args) {

        int[] array = {11,33,66,44,13,56,34,90};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     *
     * 判断数组是否有序
     * @param array int[] array
     * @return 返回是boolean类型，true  or  false
     */

    public static boolean isSorted(int[] array) {

        if(array == null || array.length == 0) {//两个顺序不能变,array.length == 0如果在前，数组为空的话直接报空指针异常
            return false;
        }
        for(int i =0;i<array.length - 1;i++) {
            if(array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main1(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        System.out.println(isSorted(array));
    }
}
