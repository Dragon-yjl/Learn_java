package nowCoder8_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double ave = 0;
        while (s.hasNext()) {
            for(int i = 0; i < 5;i++) {
                ave += s.nextInt();
            }
            System.out.println(ave/5.0);
        }
     }
}
