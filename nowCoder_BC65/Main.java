package nowCoder_BC65;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int  i = s.nextInt();
            for(int a = 0;a < i;a++) {
                for(int b = 0;b < (2*i) - 2*a;b++) {
                    System.out.print(" ");
                }
                for(int c = 0;c <=a;c++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int j = 0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
            for(int a = 1;a <= i;a++) {
                for(int b =0;b < 2*a;b++) {
                    System.out.print(" ");
                }
                for(int c = 0;c <=i-a;c++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
