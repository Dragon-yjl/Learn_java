package exception0831;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        System.out.println(test(1));//2 前面抛出的1会被覆盖
        System.out.println(test(2));//2

    }

    public static int test(int i) {
        try {
            if(i==0)
                throw new SQLException();
            if(i==1)
                return 1;
            if(i==2)
                throw new ArrayIndexOutOfBoundsException();
        }catch (SQLException e) {
            throw new RuntimeException("1");
        }catch (Exception e) {
            throw new RuntimeException("2");
        } finally {//一般这里面不写return 不然都会打印这个值
            //return 2;


        }
        return 0;//在这写就可以抛异常
        //不管是return还是抛异常 方法如果有返回值，一定要把所有逻辑分支覆盖完整
    }//条件逻辑分支如果没有覆盖完，所以需要返回值
}
