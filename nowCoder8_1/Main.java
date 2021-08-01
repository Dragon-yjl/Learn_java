package nowCoder8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] st = str.split(",|=");
        //st[0] = a st[1] = 1 st[2] = b st[3] = 2
        String t = st[1];
        st[1] = st[3];
        st[3] = t;
        System.out.println(st[0]+"="+st[1]+"="+","
        +st[2]+"=" +st[3]);
    }
}
