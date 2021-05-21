package test521;
/*
* 递归方法是使用
*1.递归方法：一个方法体内调用他自身
* 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种
* 重复执行无需循环控制，递归一定要向已知方向递归，否则这种递归
* 就变成了无穷递归，类似于死循环
*
* */
public class RecursionTest {

    public static void main(String[] args) {
    //1.计算1-100之间所有自然数的和

    //方式一：循环
    int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
        sum += i;
        }
        System.out.println(sum);
         

        //方式二：递归
        RecursionTest test = new RecursionTest();
        int sum1 = test.getSum(100);
        System.out.println(sum1);
        System.out.println("*******************  " +
                "");

        RecursionTest test1 = new RecursionTest();
        int f1 = test.f(10);
        System.out.println(f1);

    }
    public int getSum(int n){

        if(n==1){
            return  1;
        }else{
            return n + getSum(n - 1);
            //return n * getSum(n - 1);计算n！
        }

    }

    //已知有一个数列，f(0)=1,f(1)=4;f(n+2)=2*f(n+1)+f(n)
    //其中n大于0，求f(10)
    public int f(int n){
        if(n == 0){
            return  1;
        }else if(n == 1){
            return  4;
        }else{
            return 2*f(n - 1) + f(n - 2);
        }

    }
}
