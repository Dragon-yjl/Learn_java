package Test6_18;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        MyArrayTest myArrayTest = new MyArrayTest();

        myArrayTest.add(0,7);
        myArrayTest.add(1,6);
        myArrayTest.add(2,5);
        myArrayTest.add(3,4);
        myArrayTest.add(4,3);
        myArrayTest.add(5,2);
        myArrayTest.add(6,1);

        myArrayTest.display();

        System.out.println(myArrayTest.contains(7));//,输入一个元素，找到返回true，找不到返回false
        System.out.println(myArrayTest.getPos(6));//输入一个值，找数字所对用的位置的元素
        System.out.println(myArrayTest.search(0));//输入一个值，找这个元素所在位置
        myArrayTest.setPos(0,10);
        myArrayTest.display();
        System.out.println(myArrayTest.size());

        myArrayTest.clear();
        myArrayTest.display();

        myArrayTest.remove(10);
        myArrayTest.display();

        myArrayTest.remove(4);
        myArrayTest.display();

        myArrayTest.remove(1);
        myArrayTest.display();
    }
}
