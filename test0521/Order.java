package test0521;

public class Order {

    private int orderPrivate;
    int orderDefault;
    public int orderPublic;


    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 12;
        orderPublic = 3;

    }
    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 12;
        orderPublic = 3;

    }
    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 12;
        orderPublic = 3;

    }

}
