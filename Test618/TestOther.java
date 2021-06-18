package Test618;


/**
 * 可以在另外的类中测试别的代码
 */


public class TestOther {




    //测试Calculator里面的代码
    public static void main1(String[] args) {
        Calculator cal = new Calculator();

        //用set赋值
        cal.setNum1(10);
        cal.setNum2(20);

        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.dev());

        System.out.println("==============");

        //用构造方法赋值，传参
        Calculator cal1 = new Calculator(1,2);

        System.out.println(cal1.add());
        System.out.println(cal1.sub());
        System.out.println(cal1.mul());
        System.out.println(cal1.dev());


    }
}
