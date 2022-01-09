package com.yjl.test0109;

public class Demo1 {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for(int j = 0;j < i;j++) {
                System.out.print(" ");
            }
            for(int j = 5;j >= i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
