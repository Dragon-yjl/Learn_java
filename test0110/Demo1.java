package com.yjl.test0110;

public class Demo1 {

    public static void main1(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for(int j = 5;j >=i;j--) {
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++) {
                System.out.print("*");
            }
            for(int j = 1;j < i;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {

        for(int i = 1; i <= 9;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
