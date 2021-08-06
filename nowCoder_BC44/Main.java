package nowCoder_BC44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int z = s.nextInt();
            if(z%2 == 0) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }
    }
}
