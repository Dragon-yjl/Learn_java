package nowCoder_BC62;

import java.util.Scanner;
//金字塔
public class Solution {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int i = sca.nextInt();
            for(int a = 1;a <= i;a++) {
                for(int b = 0; b < i - a;b++) {
                    System.out.print(" ");
                }
                for(int c = a; c>0 ; c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
