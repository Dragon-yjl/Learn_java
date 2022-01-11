package com.yjl.array0111;

import java.util.Arrays;

public class Demo34 {

    // 将二维数组转化为稀疏数组

    /**
     * 稀疏数组的格式
     *  行   列    有效值
     *  1    2       1
     *  2    3       2
     *
     */

    public static void main(String[] args) {

        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;

        for( int[] arr1 : arr) {
            for(int arr2 : arr1) {
                System.out.print(arr2+"\t");
            }
            System.out.println();
        }


        System.out.println("============================");

        // 1、求二维数组中有效数据的个数

        int sum = 0; // 记录有效数据的个数
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0) {
                    sum++;
                }
            }
        }

        System.out.println("有效数据的个数："+sum);

        // 2、创建一个稀疏数组

        int[][] array2 = new int[sum+1][3];

        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        // 3、遍历二维数组，把所有有效数据放到稀疏数组中

        int count = 0; // 记录有效的数据的行数
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0) {
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = arr[i][j];
                }
            }
        }

        // 4、输出转化后的稀疏数组

        System.out.println("转化后的稀疏数组为：");
        for( int[] arrOut : array2) {
            for(int arrInt : arrOut) {
                System.out.print(arrInt+"\t");
            }
            System.out.println();
        }


        // 将稀疏数组还原为二维数组
        // 1、读取稀疏数组

        int[][] array3 = new int[array2[0][0]][array2[0][1]];

        // 2、遍历稀疏数组，将稀疏数组中的值还原到二维数组

        for (int i = 1; i < array2.length; i++) { // 当i==0的时候是稀疏数组的头部信息不用读取
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        // 3、输出还原后的二维数组
        System.out.println("还原后的数组：");
        for( int[] arrOut : array3) {
            for(int arrInt : arrOut) {
                System.out.print(arrInt+"\t");
            }
            System.out.println();
        }
    }
}
