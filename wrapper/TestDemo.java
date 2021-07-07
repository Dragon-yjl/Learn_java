package wrapper;

public class TestDemo {

    public static void main(String[] args) {

        System.out.println(Integer.BYTES);//4
        System.out.println(Integer.SIZE);//32

        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647

        System.out.println(new Integer(100));//100
        System.out.println(new Integer("1024"));//1024

        System.out.println(Integer.compare(100,300));//-1
        Integer a = 100;
        System.out.println(a.compareTo(20));//1

        System.out.println(Integer.max(20, 30));//30
        System.out.println(Integer.min(20, 30));//30


    }
}
