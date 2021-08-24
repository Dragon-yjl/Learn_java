package nowCoder_BC64;
//k型图案
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        while (s.hasNext()) {
            int i = s.nextInt();
            for(int a = 0;a < i;a++) {
                for(int b = 0;b <= i - a;b++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("*");
            for(int a = 0;a < i;a++) {
                for(int b = 0;b <= a+1;b++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
