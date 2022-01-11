package com.yjl.array0111;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,2,4,56,3,25,6,34,2,1,5,5667,3,23};


        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr);

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));


    }


    public static void bubbleSort(int[] arr) {


        for (int i = 0; i < arr.length-1; i++) {

            boolean flag = false;
            for(int j = 0;j < arr.length-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;
                }

            }

            if(!flag) {
                break;
            }

        }
    }
}
