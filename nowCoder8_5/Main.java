package nowCoder8_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n;i++) {
            array[i] = s.nextInt();
        }

        Arrays.sort(array);
        for(int i = n-1; i >= n-5;i--) {
            System.out.print(array[i]+" ");
        }
    }
}
