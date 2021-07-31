package nowCoder7_31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int a =  s.nextInt();
            System.out.println(2 << (a-1));
        }
    }
}
