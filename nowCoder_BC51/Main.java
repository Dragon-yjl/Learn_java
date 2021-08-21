package nowCoder_BC51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int a = sca.nextInt();
            int b = sca.nextInt();
            int c = sca.nextInt();

            if(a + b > c && a + c > b && b + c > a) {//是三角形
                if(a == b && b == c && c == a) {//等边
                    System.out.println("Equilateral triangle!");
                }else if(a != b && b != c && c != a) {//其他
                    System.out.println("Ordinary triangle!");
                }else {//等腰
                    System.out.println("Isosceles triangle!");
                }

            }else {
                System.out.println("Not a triangle!");
            }
        }
    }
}
