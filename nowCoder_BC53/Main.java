package nowCoder_BC53;

//计算一元二次方程
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            if(a == 0) {
                System.out.println("Not quadratic equation");

            }else {
                float d = (b*b)-(4*a*c);
                if(d==0) {
                    float x= (-b)/(2*a);
                    System.out.println("x1=x2="+String.format("%.2f", x));
                }else if(d>0) {
                    float x1 =(float) (((-b)+(Math.sqrt(d)))/(2*a));
                    float x2 =(float) (((-b)-(Math.sqrt(d)))/(2*a));
                    if(x1<x2) {
                        System.out.println("x1="+String.format("%.2f", x1)+";"+"x2="+String.format("%.2f", x2));
                    }else {
                        float tmp = x1;
                        x1 = x2;
                        x2 = tmp;
                        System.out.println("x1="+String.format("%.2f", x1)+";"+"x2="+String.format("%.2f", x2));
                    }
                }else {
                    float s = (-b)/(2*a);
                    float x = (float) (Math.sqrt(-d)/(2*a));
                    System.out.println("x1="+String.format("%.2f", s)+"-"+String.format("%.2f", x)+"i;x2="+String.format("%.2f", s)+"+"+String.format("%.2f", x)+"i");
                }
            }
        }
    }
}