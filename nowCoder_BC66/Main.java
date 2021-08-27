package nowCoder_BC66;

import java.util.Scanner;
//反斜型图案
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int i = s.nextInt();
            for(int a = i;a > 0;a--) {
                for(int b = 0;b < i-a ;b++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
