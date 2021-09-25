package test_925;


class Value{

    public int val;


}

public class SwapTest {

    public static void  Swap(Value v1,Value v2) {
        int tmp = v1.val;
        v1.val = v2.val;
        v2.val = tmp;

    }

    public static void main(String[] args) {

        Value v1 = new Value();
        Value v2 = new Value();

        v1.val = 10;
        v2.val = 20;

        System.out.println(v1.val+" "+v2.val);
        Swap(v1,v2);
        System.out.println(v1.val+" "+v2.val);




    }

}
