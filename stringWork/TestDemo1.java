package stringWork;


import javax.sound.midi.SoundbankResource;

/**
 *   String通过+号进行拼接的时候，底层被优化为StringBuilder
 *  Str+= 底层优化为StringBuilder.append
 *
 *  StringBuffer 多线程
 *  StringBuilder 单线程
 *  String  单线程 String的拼接底层会被优化为StringBuilder
 *  String和StringBuffer最大的区别在于：String的内容无法修改，而StringBuffer的内容可以修改。
 *  频繁修改字符串的情况考虑使用StingBuffer。
 */


public class TestDemo1 {

    public static void main(String[] args) {

        String str = "abcd";

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i = 0;i<10;i++) {

            sb.append(i);
            str = sb.toString();
        }
        System.out.println(str);
    }

    public static void main1(String[] args) {

//        String str = "hello";
//        str += "word";
//        System.out.println(str);
//
//        System.out.println("============");

        String str = "hello";
        StringBuilder sb = new StringBuilder();
        sb.append(str).append("word");
        str = sb.toString();
        System.out.println(str);

    }
}
