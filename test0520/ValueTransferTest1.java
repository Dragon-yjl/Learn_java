package test0520;
/*
方法的形参的传递机制：值传递
1.形参：方法定义时：生命的小括号内的参数
实参：方法调用时，实际传递给形参的数据

2.值传递机制：
 如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
 如果参数是引用数据类型，此时实参赋给形参的实参存储数据的地址值
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {

        //交换两个变量的值得操作
        int m = 10;
        int n = 20;

        System.out.println("m= " + m + ",n= " + n);
        /*int temp = m;
        m = n;
        n = temp;
        */
        //交换成功

        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(m,n);//交换失败
        //交换的是swap中的值
        System.out.println("m= " + m + ",n= " + n);
        //这输出的m n是main方法中的值
    }

    public void swap(int m, int n){

        int temp = m;
        m = n;
        n = temp;
    }
}

