package nowCoder_BC43;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int score = s.nextInt();
            if (score >= 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
