package test_0905;


class Value {

    int val;


}
public class SwapTest {

    public static void swap(Value val1,Value val2) {
        int tmp = val1.val;
        val1.val = val2.val;
        val2.val = tmp;

    }

    public static void main(String[] args) {
        Value val1 = new Value();
        Value val2 = new Value();

        val1.val = 10;
        val2.val = 20;

        System.out.println(val1.val+" "+val2.val);
        swap(val1,val2);
        System.out.println(val1.val+" "+val2.val);
    }

}
