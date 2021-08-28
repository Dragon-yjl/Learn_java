package nowCoder_BC68;
//X型图案
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < n;j++) {
                    if(i == j || j == n-i-1) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
