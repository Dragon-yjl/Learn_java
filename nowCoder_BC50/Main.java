package nowCoder_BC50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int t = sca.nextInt();

            if(t>0) {
                System.out.println("1");
            }else if(t==0) {
                System.out.println("0.5");
            }else {
                System.out.println("0");
            }
        }
    }
}
