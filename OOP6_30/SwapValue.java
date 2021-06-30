package OOP6_30;


class Value {

    public int val;

}

public class SwapValue {

    public static void swap (Value myValue1,Value myValue2){

        int tmp = myValue1.val;
        myValue1.val = myValue2.val;
        myValue2.val = tmp;


    }

    public static void main(String[] args) {

        Value myValue1 = new Value();
        Value myValue2 = new Value();

        myValue1.val = 10;
        myValue2.val = 20;

        System.out.println(myValue1.val+" "+myValue2.val);

        swap(myValue1,myValue2);

        System.out.println(myValue1.val+" "+myValue2.val);
    }
}
