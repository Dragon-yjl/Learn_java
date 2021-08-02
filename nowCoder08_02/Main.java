package nowCoder08_02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = s.nextInt();
        int m = s.nextInt();
        if(m > n*h) {
            return;
        }

        if(m%h == 0) {//整除说明刚好喝完
            System.out.println(n - m / h);
        }else {//说明已经打开了但没有喝完
            System.out.println(n - m/h - 1);
        }
    }
}
