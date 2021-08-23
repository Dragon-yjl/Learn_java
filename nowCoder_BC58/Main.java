package nowCoder_BC58;

import java.util.Scanner;

//直角三角形图案
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int count = sca.nextInt();

            for(int i = 0;i < count;i++) {
                for(int j = 0;j<=i;j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
