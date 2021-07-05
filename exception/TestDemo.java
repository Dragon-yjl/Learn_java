package exception;

public class TestDemo {

    public int num = 10;

    public static void func() {
        int[] arr = {1,2,3};
        System.out.println(arr[100]);
    }

    public static void main(String[] args) {
        try {
            func();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }

    /**
     * java.lang.ArrayIndexOutOfBoundsException: 100
     * 	at exception.TestDemo.func(TestDemo.java:9)
     * 	at exception.TestDemo.main(TestDemo.java:14)
     * after try catch
     */
    public static void main1(String[] args) {

        TestDemo t = null;
        System.out.println(t.num);
        //NullPointerException
    }
}
