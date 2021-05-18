package exer518;

public class ExerTest2 {
    public static void main(String[] args) {
        ExerTest2 test = new ExerTest2();

        int area2 = test.methd(12,10);
        System.out.println("面积为："+area2 );
    }

    public int methd(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        return  m*n;
    }
}
