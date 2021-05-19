package exer518;

public class ExerTest1 {
    public static void main(String[] args) {
        ExerTest1 test1 = new ExerTest1();

        int area = test1.methd();
        System.out.println("面积为："+ area);

        //方式二
        // System.out.println(test1.methd());
    }

    public int methd(){


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        return  10*8;
    }
}
