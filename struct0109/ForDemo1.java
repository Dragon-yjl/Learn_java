package com.yjl.struct0109;

public class ForDemo1 {

    /**
     * 1--100奇偶数之和
     */
    public static void main1(String[] args) {

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= 100; i++) {
            if(i %2 == 0) {
                evenSum += i;
            }else {
                oddSum += i;
            }
        }

        System.out.println("奇数和"+oddSum);
        System.out.println("偶数和"+evenSum);
    }


    public static void main(String[] args) {

        //九九乘法表

        for (int i = 1; i <= 9; i++) {

            for(int j = 1;j <= i;j++) {
                System.out.print( j+"*"+i+"="+i*j+"\t");

            }
            System.out.println();
        }
    }

}
