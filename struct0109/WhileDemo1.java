package com.yjl.struct0109;

public class WhileDemo1 {

    public static void main1(String[] args) {

        int i = 1;

        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println(i+"总和"+sum);

    }

    /**
     * 1--1000可以被5整除的数，每3个换行
     */

    public static void main(String[] args) {
        int i = 1;

        while (i < 1000) {
            if(i %5 == 0) {
                System.out.print(i+" ");
            }
            if(i % (5*3) == 0) {
                System.out.println();
            }

            i++;
        }

    }
}
