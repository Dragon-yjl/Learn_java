package nowCoder_BC62;

import java.util.Scanner;
//翻转金字塔
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int i = sca.nextInt();
            for(int a = i;a > 0;a--) {
                for(int b = i-a; b > 0;b--) {

                    System.out.print(" ");
                }
                for(int c = a; c >0; c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
