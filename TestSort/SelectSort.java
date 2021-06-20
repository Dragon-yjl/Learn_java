package TestSort;

import java.util.Arrays;

public class SelectSort {

    public static void selectSort(int[] array) {

        for(int i = 0;i<array.length-1;i++) {
            int min = i;
            for(int j = i;j<array.length;j++) {
                if(array[j]<array[min]) {
                    min = j;
                }
            }
            if(i != min) {
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {15, 3, 4, 72, 78, 90, 100, 666, 444};


        System.out.println(Arrays.toString(array));

        selectSort(array);

        System.out.println(Arrays.toString(array));
    }


    }
