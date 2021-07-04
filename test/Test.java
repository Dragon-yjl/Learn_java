package test;
public class Test{

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
         fun(sb);
        System.out.println(sb);
    }
    public static void fun(StringBuffer temp) {
        temp.append("\n").append("www.bit.com.cn");
    }
}