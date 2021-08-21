package nowCoder_BC49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int i = sca.nextInt();
            int j = sca.nextInt();
            if(i<j) {
                System.out.println(i+"<"+j);
            }else if(i==j) {
                System.out.println(i+"="+j);
            }else {
                System.out.println(i+">"+j);
            }
        }
    }
}
