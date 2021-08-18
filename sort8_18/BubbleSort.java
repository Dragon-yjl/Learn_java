package sort8_18;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int[] array, int a, int b) {
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    public static void bubbleSort(int[] array) {

        for(int i = 0; i < array.length-1;i++) {
            boolean flg = true;
            for(int j = 0; j < array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    swap(array,j,j+1);
                    flg = false;
                }
            }
            if(flg) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = new int[]{9,8,4,7,62,6,5,46,38,8,2,1};
        System.out.println(Arrays.toString(array));

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
