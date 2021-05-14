package test514;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,3,2,8,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2.String toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        //3.void fill(int[] a,int val):将指定值填充到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4.void sort(int[] a):对数组进行排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.int binarySearch(int[] a,int key)查找元素位置
        int [] arr3 = new int[]{-90,-80,-30,0,10,20,30,40};
        int index = Arrays.binarySearch(arr3,-90);
        if(index >= 0){
            System.out.println(index);
        }else{
            System.out.println("未找到");
        }
    }
}
