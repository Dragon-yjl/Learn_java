package nowCoder_BC57;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int i = sca.nextInt();
            for(int a = 0;a < i;a++) {
                for(int b = 0;b < i;b++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
