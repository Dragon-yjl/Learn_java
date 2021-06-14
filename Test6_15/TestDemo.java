package Test6_15;

public class TestDemo {

    public static int add(int x,int y) {
        return x+y;
    }

    public static double add(double x,double y) {
        return x+y;
    }

    //以上两个方法构成重载
    //
    public static double add(int x, double y) {
        return x+y;
    }

    public static double add(int x,int y,double z) {
        return x+y+z;
    }
}
