package TestArray;

import java.util.Arrays;

public class DoubleArray {

    /**
     * 打印一个二维数组,二维数组的每一个元素里面存的是一个地址，指向一个一维数组
     * @param array 二维数组数组长度Array.length就是二维数组的行数，每个array[i]
     *              里面都存着一个一维数组，数组长度就是array[i].length,二维数组的列数
     */
    public static void print(int[] [] array) {

        for(int i = 0;i<array.length;i++) {
            for(int j = 0;j<array[i].length;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main11(String[] args) {
        int[][] array = {{12,34,56,67},{34,32,43,64}};

        print(array);
        System.out.println(Arrays.toString(array));
    }



    public static void main2(String[] args) {
        int [] [] array = {{1,2,3},{4,5,6}};

        System.out.println(array[1][2]);

        //以下打印方式不正确，是在你知道数组长什么样的时候，
        for(int i = 0;i<2;i++) {
            for(int j = 0;j<3;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    } //输出结果
      //1 2 3
      //4 5 6

    public static void main(String[] args) {

        //二维数组
        int [] [] array1 = {{1,2,3},{4,5,6}};
        int [] [] array2 = new int [] [] {{1,2,3},{4,5,6}};

        int [] [] array3 = new int [2] [3];
        int [] [] array4 = new int [2] [];//不规则二维数组,只有行数，每个元素里面存的是null，打印报错，空指针异常
        array4[0] = new int[]{1,2,3};
        array4[1] = new int[]{4,5};
        print(array4);//1 2 3
                      //4 5

        System.out.println(array4[0]);//[I@1b6d3586
        System.out.println(Arrays.toString(array4));//数组地址,每一个地址里面存着一个一维数组[[I@1b6d3586, [I@4554617c]
        //System.out.println("-------------");
        //System.out.println(Arrays.deepToString(array4));

    }
}
