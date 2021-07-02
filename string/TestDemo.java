package string;

/*
* 一旦一个字符串常量，被存储到常量池中之后
* 只有一份
* 如果后续还有相同的字符串需要存放的时候，首先需要看当前
* 常量池中是否有该字符串常量
* 只要是双引号引起来的字符串，都会存放到字符串常量池中 且只有一份
* */

public class TestDemo {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = new String("'hello");
        System.out.println(str1 == str2);
        //结果是false 因为str1 str2都是引用，存放的是地址，不一样
        System.out.println(str1.equals(str2));
        //true

        String str3 ="hello";
        System.out.println(str1 == str3);
        //true 存放在常量池中 str1的值跟str3的值是一样的

        System.out.println(str1.equals(str3));//true
        //str1这个引用指向的对象和str3指向的对象内容相同
    }

    public static void main1(String[] args) {

        String str1 = "hello";
        String str2 = str1;

        System.out.println(str1);
        System.out.println(str2);
        str1 = "gumo";//str1修改之后，str2仍旧不变
        //反射可以修改指向的对象
        System.out.println(str1);
        System.out.println(str2);
        str2 = "gunai";
        System.out.println(str1);
        System.out.println(str2);
    }


    public static void main11(String[] args) {

        String str1 = "hello";
        String str2 = new String("'hello");

        char[] value = {'a','b','c','d'};
        String str3 = new String(value);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(value);
    }
}
