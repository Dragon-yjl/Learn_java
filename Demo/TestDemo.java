package Demo;

public class TestDemo {

    /**
     * 青蛙跳台阶问题，一次可以跳一个或者两个台阶
     * 递归方法，变相的fibonacci数列，递归方法不是最好的，可以用循环
     * @param n 台阶数
     */

    public static int jumpFloor(int n) {
        if(n <= 0) {
            return -1;
        }
        if(n == 1) {
            return  1;
        }
        if(n == 2) {
            return  2;
        }
        return jumpFloor(n-1) + jumpFloor(n-2);

    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(5));
    }

    //递归求fibonacci数列前n项

    //递归过程依赖于二叉树
    //多路递归
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main1(String[] args) {
        System.out.println(fibonacci(7));
    }

    /**
     * 汉诺塔移动
     *
     * @param pos1 起始位置
     * @param pos2 终止位置
     */
    public static void move(char pos1, char pos2) {

        System.out.print(pos1 + "->" + pos2+" ");
    }

    /**
     * 汉诺塔问题
     *1个盘子移动2*1-1,2个盘子移动2*2-1次，n个盘子移动2*n-1次
     * @param n    盘子的数目
     * @param pos1 起始位置
     * @param pos2 中途位置
     * @param pos3 结束为止
     */

    public static void hanoi(int n, char pos1, char pos2, char pos3) {

        if (n == 1) {
            move(pos1, pos3);
        } else {
            hanoi(n - 1, pos1, pos3, pos2);
            move(pos1, pos3);
            hanoi(n - 1, pos2, pos1, pos3);
        }

    }

    public static void main2(String[] args) {

        hanoi(2, 'A', 'B', 'C');

        System.out.println();
        hanoi(3,'A','B','C');

        System.out.println();
        hanoi(4,'A','B','C');

}
}
