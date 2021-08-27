package nowCoder_BC67;

import java.util.Scanner;
//正斜型图案
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int i = s.nextInt();
            for(int a = 0;a < i;a++) {
                for(int b = 0;b < i-a-1 ;b++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
