package TestArray;

import java.util.Arrays;

public class Array {

    /**
     * 输入一个数组，倒序输出
     * @param array 输入{1,2,3,4,5}
     *              输出{5,4,3,2,1}
     */
    public static void reversePrint(int[] array) {

        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }


    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        reversePrint(array);
        System.out.println(Arrays.toString(array));
    }
}
