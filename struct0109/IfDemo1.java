package com.yjl.struct0109;

import java.util.Scanner;

public class IfDemo1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();


        if(str.equals("Hello")) {
            System.out.println(str);
        } else {

            System.out.println("END");
        }




        s.close();

    }
}
