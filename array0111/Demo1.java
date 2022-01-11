package com.yjl.array0111;

import java.util.Arrays;

public class Demo1 {

    public static void main(String[] args) {

        int[] arr = {2,34,5,67,8,12,4,6,8,0,54,90};

        System.out.println(Arrays.toString(arr));

        System.out.println("================");

        Arrays.fill(arr,2,6,0);

        print(arr);
    }


    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                System.out.print("["+arr[i]+", ");
            }else if(i == arr.length-1){
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i]+", ");
            }
        }
    }
}
