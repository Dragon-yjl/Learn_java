package yjl512;

import java.util.Scanner;

public class test512 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number=scanner.nextInt();
        int []scores=new int [number];
        System.out.println("请输入"+number+"学生成绩:");
        for (int i = 0; i <scores.length ; i++) {
            scores[i]=scanner.nextInt();
        }
        int maxScore=0;
        for (int i = 0; i <scores.length ; i++) {
            if(maxScore<scores[i]){
                maxScore=scores[i];
            }

        }
        char level;
        for (int i = 0; i <scores.length ; i++) {
            if(maxScore-scores[i]<=10){
                level='A';
            }else if(maxScore-scores[i]<=20){
                level='B';
            }else if(maxScore-scores[i]<=30){
                level='C';
            }else {
                level='D';
            }
            System.out.println(" student " + i + " score is "
            + scores[i] +" , grade is " + level);
        }

    }
}
