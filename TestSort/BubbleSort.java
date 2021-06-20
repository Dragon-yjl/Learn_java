package TestSort;

import java.util.Arrays;

public class BubbleSort {

    public static void BobbleSort(int[] array) {

        for(int i = 0;i<array.length-1;i++) {
            boolean flag = false;
            for(int j = 0;j<array.length -1-i;j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] =array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {//if(flag = false)
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {15,3,4,72,78,90,100,666,444};


        System.out.println(Arrays.toString(array));
        BobbleSort(array);

        System.out.println(Arrays.toString(array));



    }
}
