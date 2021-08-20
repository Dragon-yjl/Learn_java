package nowCoder0820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {

            char c = sca.next().charAt(0);
            if(c>=65 && c<=90 || c>=97 && c<=122) {
                System.out.println(c + " is an alphabet.");
            }else {
                System.out.println(c + " is not an alphabet.\n");
            }
        }
    }
}
