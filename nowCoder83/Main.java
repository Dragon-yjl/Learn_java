package nowCoder83;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double price = s.nextDouble();
        int month = s.nextInt();
        int day = s.nextInt();
        int q = s.nextInt();

        if (month ==11 && day == 11) {
            price = price * 0.7;
        }else if(month == 12 && day ==12) {
            price = price * 0.8;
        }

        if(q == 1) {
            price -= 50;
        }

        if(price <= 0) {
            price = 0;
        }
        System.out.printf("%2.f",price);

    }
}
