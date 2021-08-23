package nowCoder_BC60;

import java.util.Scanner;
//带空格直角三角形
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int i = s.nextInt();
            for(int a = 1;a <= i;a++) {
                //打印空格
                for(int b = i-a; b >0;b--) {
                    System.out.print("  ");
                }
                //打印*
                for(int c = a;c > 0;c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
