package test514;

import java.util.Scanner;

public class HuiXingShu {
    public static void main(String[] args) {

        //用户输入一个维度（整数）
        System.out.println("请输入你的维度:");
        Scanner scanner = new Scanner(System.in);
        int Weidu = scanner.nextInt();

        //定义一个二维数组
        int[][] array = new int[Weidu][Weidu];

        //调用递归函数
        HuiXin(array,0,Weidu,1);

        //打印相应的矩阵到屏幕上
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();

        }

    }

    //x 表示每个圈起始横纵下标
    //number 每个圈起始数字
    public static void HuiXin(int[][] array,int x,int Weidu,int number) {
        if ((Weidu - 2) >= 0) {

            //此循环为了赋值1,2（行下标不变，列下标变化）
            for (int i = 0; i < Weidu - 1; i++) {
                array[x][x + i] = number++;
            }

            //次循环为了赋值3,4（行下标变化，列下标不变）
            for (int i = 0; i < Weidu - 1; i++) {
                array[x + i][x + Weidu - 1] = number++;
            }

            //次循环为了赋值5,6（行下标不变，列下标变化）
            for (int i = Weidu - 1; i > 0; i--) {
                array[x + Weidu - 1][x + i] = number++;
            }

            //次循环为了赋值7,8（行下标变化，列下标不变）
            for (int i = Weidu - 1; i > 0; i--) {
                array[x + i][x] = number++;
            }

            HuiXin(array ,x+1,Weidu-2,number);
        }
        else if((Weidu-1)==0){
            array[x][x] = number++;
            HuiXin(array,x+1,Weidu-2,number);
        }else{
            System.out.println("无法构成回形数");
        }
    }
}
