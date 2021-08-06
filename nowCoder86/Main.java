package nowCoder86;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if(score >= 90 && score <= 100) {
            System.out.println("Perfect");
        }
    }
}
