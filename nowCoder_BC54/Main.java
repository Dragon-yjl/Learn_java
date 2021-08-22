package nowCoder_BC54;

//获取月份天数
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int Y = sca.nextInt();
            int M = sca.nextInt();
            if(M == 2) {
                if (Y % 400 == 0 || Y % 4 == 0 && Y % 100 != 0) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
            }else if(M==4 || M==6 || M==9 || M==11){
                System.out.println("30");
            }else {
                System.out.println("31");
            }
        }
    }
}
