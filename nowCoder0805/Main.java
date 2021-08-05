package nowCoder0805;

public class Main {
    public static void main(String[] args) {
        for(int i = 10000; i < 100000;i++) {
            int a = i/10000;
            int a1 = i%10000;
            int b = i/1000;
            int b1 = i%1000;
            int c = i/100;
            int c1 = i%100;
            int d = i/10;
            int d1 = i%10;

            if(a*a1 + b*b1 + c*c1 + d*d1 == i) {
                System.out.print(i+" ");
            }
        }
    }
}
