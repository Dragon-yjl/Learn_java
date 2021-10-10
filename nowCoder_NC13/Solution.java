package nowCoder_NC13;

public class Solution {

    /**
     * 字符串反转
     * 方法一：StringBuilder的reverse()方法
     * @param str 输入一个String类型得字符串
     * @return  输出一个翻转过来之后的String字符串
     */
    public static String solve1 (String str) {

        return new StringBuilder(str).reverse().toString();
    }

    public static String solve(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;

        for(int i = 0; i < len;i++) {
            chars[i] = str.charAt(len-1-i);
        }

        return new String(chars);
    }

    public static void main(String[] args) {

        String s = "abcdefg";
        String solve = solve(s);
        System.out.println(solve);
    }
}
