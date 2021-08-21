package nowCoder_BC52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            double w = sca.nextDouble();
            double h = sca.nextDouble();

            h = h/100.0;
            double BMI = w/(h*h);
            if(BMI < 18.5) {
                System.out.println("Underweight");
            }else if(BMI >= 18.5 && BMI <= 23.9) {
                System.out.println("Normal");
            }else if(BMI > 23.9 && BMI <= 27.9) {
                System.out.println("Overweight");
            }else {
                System.out.println("Obese");
            }
        }
    }
}
