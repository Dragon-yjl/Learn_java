package test6_14;

import java.sql.SQLRecoverableException;

public class TestDemo1 {

    /**
     * 有一组数据，一个元素只出现一次，其他出现两次，找出这个出现一次的元素
     * @param array
     * @return
     */
    public static int findOnce(int[] array) {

        //数组里面所有元素异或^起来就是出现一次的元素
        //因为任何数异或任何数等于0,0异或任何数等于任何数
        int ret = 0;
        for(int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        return  ret;
    }

    /**
     * 一组数据吧奇数放到偶数前面，不关心大小
     * @param array
     */
     public static void swapNum(int[] array) {

         int i = 0;
         int j = array.length -1;
         while (i<j && array[j]%2 == 0) {
             j--;
         }
         while (i<j && array[i]%2 != 0) {
             i++;
         }
         int tmp = array[i];
         array[i] = array[j];
         array[j] = tmp;
     }

    /**
     * 两个数求最大值
     * @param a
     * @param b
     * @return
     */
     public static int max2(int a,int b) {
         return a > b ? a : b;
     }

    /**
     * 三个数求最大值
     * @param a
     * @param b
     * @param c
     * @return
     */
     public  static int max3(int a,int b,int c) {
         /*int maxTmp = max2(a,b);
         int max = max2(maxTmp,c);
         return  max;*/
         //或
         return max2(c,max2(a,b));
     }

     public static int fibonacci(int n) {
         if(n<0)
             return -1;
         if(n==1 || n== 2)
             return 1;
         int f1 = 1;//第一项
         int f2 = 1;//第二项
         int f3 = 0;
         for(int i = 3;i<=n;i++) {
             f3 = f1+f2;
             f1 = f2;//求后面的几项的时候，f1就等于为空了，吧f2的值给f1，把f3的值给f2
             f2 = f3;
         }
         return f3;
     }


    public static void main(String[] args) {
        /*int[] array = {1,2,3,4,5,6,7,8};
        //int ret = findOnce(array);

        swapNum(array);
        for(int i = 0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }*/
        //System.out.println(ret);
  /*      int a = 9;
        int b = 7;
        int c = 8;
        int max = max3(a,b,c);
        System.out.println(max);*/
        System.out.println(fibonacci(40));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
    }
}
