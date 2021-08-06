package nowCoder_BC45;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int[] array = new int[3];
            for (int i = 0; i < 3; i++) {
                array[i] = s.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[2]);
        }
    }
}
