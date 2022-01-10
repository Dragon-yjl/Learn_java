package com.yjl.test0110;


class ValueTest {
    public int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class Demo3 {

    public static void main(String[] args) {

        ValueTest valueTest1 = new ValueTest();
        ValueTest valueTest2 = new ValueTest();

        valueTest1.val = 10;
        valueTest2.val = 20;

        swap(valueTest1,valueTest2);

        System.out.println(valueTest1.val+" "+valueTest2.val);
    }

    private static void swap(ValueTest valueTest1, ValueTest valueTest2) {

        int tmp = valueTest1.getVal();
        valueTest1.setVal(valueTest2.getVal());
        valueTest2.setVal(tmp);
    }

}
