package nowCoder_BC75;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int i = s.nextInt();
            for (int a = i; a > 0; a--) {
                int c = 1;
                for (int b = 0; b < i - a + 1; b++) {

                    System.out.print(c++ + " ");
                }
                System.out.println();
            }
        }
    }

}
