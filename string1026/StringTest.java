package string1026;

public class StringTest {
    public static boolean isUnique(String str) {

        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            //char_set[val]=true;
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "fahuhsyw";
        boolean unique = isUnique(s);
        System.out.println(unique);

    }
}
