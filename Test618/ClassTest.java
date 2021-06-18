package Test618;


//class Value {
//
//    public int val;
//}
//public class ClassTest {
//
//
//    /**
//     * 方法一:
//     * 交换两个变量的值  借助类与对戏，创建一个类，类里面定义一个成员变量
//     * 然后再主函数中实例化对象，然后再给赋值，
//     * @param MyValue 类型是Value ,变量名是MyValue
//     * @param MyValue1  类型是Value，变量名是MyValue1
//     */
//    public static void swapValue(Value MyValue,Value MyValue1) {
//        int tmp = MyValue.val;
//        MyValue.val = MyValue1.val;
//        MyValue1.val = tmp;
//
//    }
//
//    public static void main(String[] args) {
//        Value MyValue = new Value();
//        Value MyValue1 = new Value();
//
//
//        MyValue.val = 10;
//        MyValue1.val = 20;
//        System.out.println(MyValue.val+" "+MyValue1.val);
//        swapValue(MyValue,MyValue1);
//        System.out.println(MyValue.val+" "+MyValue1.val);
//
//
//    }
//}

class Value {

    public int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

public class ClassTest {

    public static void swap(Value myValue,Value myValue1) {

        int tmp = myValue.getVal();
        myValue.setVal(myValue1.getVal());
        myValue1.setVal(tmp);
    }

    public static void main(String[] args) {

        Value myValue = new Value();
        myValue.setVal(10);

        Value myValue1 = new Value();
        myValue1.setVal(20);

        System.out.println(myValue.getVal()+ " "+myValue1.getVal());

        System.out.println("=================");

        swap(myValue,myValue1);

        System.out.println(myValue.getVal()+ " "+myValue1.getVal());
    }
}