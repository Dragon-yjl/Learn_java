package test0520;

public class OverLoadTest {

    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(1,2);//1

        test.getSum(1.0,2.0);//2

    }
    //如下4个方法构成了重载
    public void getSum(int i,int j){
        System.out.println("1");

    }

    public void getSum(double i, double j){
        System.out.println("2");

    }

    public void getSum(int i,String s){

        System.out.println("3");
    }
    public void getSum(String s,int i){

        System.out.println("4");
    }
/*  以下都不能构成重载
    public int getSum(int i,int j){
//与返回值类型无关
    }

    public void getSum(int m,int n){
//与形参变量名无关
    }

    private void getSum(int i,int j){
//与权限修饰符无关
    }

 */
}
