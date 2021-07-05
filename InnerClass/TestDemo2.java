package InnerClass;


class OutClass3 {

    public void func () {
        System.out.println("OuterClass3的function（）");
    }

}

public class TestDemo2 {

    public static void main(String[] args) {

        new OutClass3() {//匿名内部类 用到多线程
            //类内部的内容
            public int data1;

            @Override
            public void func() {
                System.out.println("我重写了OuterClass3的function（）");
            }
        }.func();
    }
}
