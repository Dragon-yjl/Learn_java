package nowCoder_BC78;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num - 1];
        int count = 0;
        for (int i = 0; i < num - 1; i++) {
            nums[i] = i + 2;
        }
        for (int i = 0; i < num - 1; i++) {
            if (nums[i]!=0) {
                System.out.printf("%d ",nums[i]);
                count++;
                for (int j = i + 1; j < num - 1; j++) {
                    if (nums[j] % nums[i] == 0) {
                        nums[j] = 0;
                    }
                }
            }
        }
        System.out.printf("\n%d",num-1-count);
    }
}
