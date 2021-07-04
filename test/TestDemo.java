package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class MyException extends RuntimeException {

    public MyException(String msg) {
        super(msg);
    }
}
public class TestDemo {

    public static void func() throws MyException {
        throw  new MyException("ijf0paefpqa");
    }

    public static void main(String[] args) {

        try {
            func();;
        }catch (MyException e) {
            System.out.println("捕获了MyException");
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }



    public static void mai1n(String[] args) {
        String str = "成都市(成华区)(武侯区)(高新区)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);
        if(m.find()) {
            System.out.println(m.group());
        }
    }
}
