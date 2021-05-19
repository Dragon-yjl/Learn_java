package test519;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        int year = 0;
        int mouth = 12;
        int days = 0;
        int d = 0;

        for (int i = 0; i <mouth ; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if((year % 100 == 0)||(year % 4 == 0&&year % 100 != 0)){
                        days = 29;
                    }else {
                        days = 28;
                    }
                    break;
            }
            d += days;

        }
        System.out.println(year + " "+mouth+" "+days+"是这一年的"+(d+days)+"天。");
    }
    class input{
        public int input(){
            int value = 0;
            Scanner s = new Scanner(System.in);
            value = s.nextInt();
            return value;
        }
    }
}
