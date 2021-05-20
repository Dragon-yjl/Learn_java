package test0520;

public class ValueTransferTest2 {
    public static void main(String[] args) {
        Date date = new Date();

        date.m = 10;
        date.n = 20;

        System.out.println("m= " + date.m + ",n= " + date.n);
        //交换m和n的值
       /* int temp = date.m;
        date.m = date.n;
        date.n = temp;
        */
        //交换成功

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(date);
        //交换成功，同一个地址，指向堆空间中同一个对象实体
        System.out.println("m= " + date.m + ",n= " + date.n);

    }

    public void swap(Date date) {
        int temp = date.m;
        date.m = date.n;
        date.n = temp;

    }

}
class Date{
    int m;
    int n;

}
