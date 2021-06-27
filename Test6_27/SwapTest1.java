package Test6_27;

class Value1 {

    public int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class SwapTest1 {

    public static void swap (Value1 myValue1,Value1 myValue2) {

        int tmp = myValue1.getVal();
        myValue1.setVal(myValue2.getVal());
        myValue2.setVal(tmp);
    }

    public static void main(String[] args) {

        Value1 myValue1 = new Value1();
        Value1 myValue2 = new Value1();

        myValue1.setVal(10);
        myValue2.setVal(20);

        System.out.println(myValue1.getVal()+" " +myValue2.getVal());

        swap(myValue1,myValue2);


        System.out.println(myValue1.getVal()+" " +myValue2.getVal());

    }
}
