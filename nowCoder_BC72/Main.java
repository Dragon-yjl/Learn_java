package nowCoder_BC72;
//平均身高
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] array = new double[5];
            for(int i = 0;i<5;i++) {
                array[i] = s.nextDouble();
            }

        double sum = array[0]+array[1]+array[2]+array[3]+array[4];
        double avg = sum/5;
        System.out.printf("%.2f",avg);
    }
}
