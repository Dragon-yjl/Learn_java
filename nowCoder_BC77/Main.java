package nowCoder_BC77;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n+1];
        for(int i = 0;i < n;i++) {
            array[i] = s.nextInt();
        }
        int j = s.nextInt();

        boolean flag = false;
        for(int i = n-1;i>=0;i--) {
            if(j < array[i]) {
                array[i+1] = array[i];
               // array[i] = j;
            }else if(array[i] <= j){
                array[i+1] = j;
                flag = true;
                break;
            }
        }
        if(!flag) {
            array[0] = j;
        }

        for(int i = 0;i<n+1;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
