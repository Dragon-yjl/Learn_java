package com.yjl.test0110;

class Value {
    public int val;
}

public class Demo22 {

    public static void main(String[] args) {

        Value value1 = new Value();
        Value value2 = new Value();

        value1.val = 10;
        value2.val = 20;


        swap(value1,value2);

        System.out.println(value1.val+" "+value2.val);


    }

    private static void swap(Value i, Value j) {

        int tmp = i.val;
        i.val = j.val;
        j.val = tmp;

    }

}
