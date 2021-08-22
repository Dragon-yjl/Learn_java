package nowCoder_BC56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int time = sca.nextInt();
            for(int i = 0;i < time;i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

