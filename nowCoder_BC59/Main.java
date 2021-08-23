package nowCoder_BC59;

import java.util.Scanner;
//翻转直角三角形图案
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int i = sca.nextInt();
            for(int a = 0;a < i;a++) {
                for(int b = 0;b <= i -a-1;b++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
