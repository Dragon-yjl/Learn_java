package nowCoder0803;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double w = s.nextDouble();
        double h = s.nextDouble();

        double BMI = w / (h*h);

        if (BMI >= 18.5 && BMI <= 23.9) {
            System.out.println("Normal");
        }else {
            System.out.println("Abnormal");
        }


    }
}
