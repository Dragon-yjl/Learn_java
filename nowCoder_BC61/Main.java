package nowCoder_BC61;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int i = sca.nextInt();
            for(int a = 1; a <= i;a++) {
                for(int b = i-a;b>0;b--) {
                    System.out.print(" ");
                }
                for(int c = a;c > 0;c--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
