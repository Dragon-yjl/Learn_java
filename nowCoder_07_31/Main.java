package nowCoder_07_31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double zh = a+b+c;
        System.out.printf("circumference=%.2f",zh);
        double x = zh/2;

        System.out.printf(" area=%.2f",Math.sqrt(x*(x-a)*(x-b)*(x-c)));

    }
}
