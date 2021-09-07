package test09_07;

//0--100有几个包含9的数字
public class Main {
    public static void main(String[] args) {
        int count= 0;

        for(int i = 1; i < 2019;i++) {
            String s = String.valueOf(i);//把数字转化为字符串
            if(s.contains("9")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
