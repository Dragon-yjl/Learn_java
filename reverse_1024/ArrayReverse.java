package reverse_1024;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] arr = {34,23,567,78,12,90,23,10,11};

        int tmp = 0;

        for(int i= 0;i < arr.length /2;i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }


}
