package nowCoder_BC63;

import java.util.Scanner;
//菱形图案
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int  i = s.nextInt();
            for(int a = 1;a <= i;a++) {
                for(int b = 0; b <= i - a;b++) {
                    System.out.print(" ");
                }
                for(int c = a; c>0 ; c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int j = 0;j <= i;j++) {
                System.out.print("* ");
            }
            System.out.println();
            for(int a = i;a > 0;a--) {
                for(int b = i-a; b >= 0;b--) {

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
