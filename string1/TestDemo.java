package string;

import jdk.nashorn.internal.runtime.ConsString;

import java.lang.reflect.Field;

/**
 * String str2 = new String("abcde").intern();
 * 检查常量池当中是否有abcde，如果有 返回常量池的引用给str2
 */

public class TestDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        String str  = "abcdef";

        System.out.println(str);
        //字符串本身不能修改 ，除非通过反射修改
        //1.过去class对象
        Class cl = String.class;
        //2.获取value字段
        Field field = cl.getDeclaredField("value");

        //3.将这个字段的访问属性设为true
        field.setAccessible(true);
        //4.把str中的value属性获取到
        char[] value =(char[]) field.get(str);

        value[0] = 'g';

        System.out.println(str);
    }

    public static void main2(String[] args) {

        String str1 = "abcde";
        String str2 = new String("abcde").intern();//加入.intern()变为true  将当前的引用存放到常量池中
        System.out.println(str1 == str2);//false
    }

    public static void main11(String[] args) {

        String str1 = "abcdef";
        String str2 = "abcwdf";
        System.out.println(str1.compareTo(str2));//-1说明str1小于str2

        String str3 = null;
        //System.out.println(str3.equals("hello"));//空指针异常
        System.out.println("hello".equals(str3));//false
    }

    public static void main1(String[] args) {

        String str1 = "abcdde";
        String str2 = "abcdde";
        System.out.println(str1 == str2);//true

        String str3 = new String("abcdde");
        System.out.println(str1 == str3);//false

        String str4 = "ab"+"cdde";//编译时期，这里就是abcdde，还是在常量池中
        System.out.println(str1 == str4);//true

        String str5 = "ab"+ new String("cdde");
        System.out.println(str1 == str5);//false

        //String str6 = "hel";//str6 是一个变量，运行的时候才能知道它是啥
        final String str6 = "hel";//true  常量 编译的时候确定了值是多少
        String str7 = str6 + "lo";
        String str8 = "hello";
        System.out.println(str7 == str8);//false
    }
}
