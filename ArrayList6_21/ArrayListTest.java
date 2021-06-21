package ArrayList6_21;


/**
 * 顺序表的测试
 */

public class ArrayListTest {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();

        myArrayList.display();

        //myArrayList.add(1,111);//0号位置没有元素插入不合法

        myArrayList.add(0,111);
        myArrayList.add(1,222);
        myArrayList.add(2,333);
        myArrayList.add(3,444);
        myArrayList.add(4,555);
        myArrayList.add(5,666);//当插入第六个元素的时候，顺序表长度不够，我们就需要给顺序表扩容

        myArrayList.display();

        System.out.println(myArrayList.contains(666));//true
        System.out.println(myArrayList.contains(123));//false

        System.out.println(myArrayList.search(111));//0
        System.out.println(myArrayList.search(123));//-1

        System.out.println(myArrayList.getPos(6));//-1
        System.out.println(myArrayList.getPos(3));//444

        myArrayList.setPos(2,520);
        myArrayList.setPos(6,10);//位置不合法

        myArrayList.display();

        myArrayList.remove(555);
        myArrayList.remove(2);//没有该数字

        myArrayList.display();
    }


}
