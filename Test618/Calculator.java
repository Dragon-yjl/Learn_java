package Test618;

public class Calculator {

    private int num1;
    private int num2;

    //空构造方法
    public Calculator() {
    }

    //两个参数都有的构造方法
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    //提供参数的get set方法
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    /**
     * 类和对象实现加减乘除
     * @return 返回加减乘除后的值
     */
    public int add() {
        return this.num1+this.num2;
    }

    public int sub() {
        return this.num1-this.num2;
    }

    public int mul() {
        return this.num1*this.num2;
    }

    public double dev() {
        return this.num1*(1.0)/this.num2;
    }

}
