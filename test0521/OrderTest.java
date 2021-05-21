package test0521;

public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();

        order.orderDefault = 1;
        order.orderPublic = 1;
        //出了Order类之后，私有的结构就不能调用了
        //order.orderprivate = 1;

        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不能调用了
        //order.methodPrivate();
    }

}
