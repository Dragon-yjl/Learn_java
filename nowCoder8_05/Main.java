package nowCoder8_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int count1 = 0;
        int count2 = 0;

        String str = s.nextLine();
        while (str.length() != sum) {
            char ch = str.charAt(sum);
            if(ch == 'A') {
                count1++;
            }else if(ch == 'B') {
                count2++;
            }else {
                break;
            }
            sum++;
        }

        if(count1 == count2) {
            System.out.println("E");
        }else if(count1 > count2) {
            System.out.println("A");
        }else {
            System.out.println("B");
        }
    }
}
