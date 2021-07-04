package testWork;

public class TestDemo {

    String str = new String("good");
    char[] ch = {'a','b','c'};

    public void change(String str,char ch[]) {
        str = "test ok";
        ch[0] = 'g';

    }

    public static void main(String[] args) {

        TestDemo test = new TestDemo();
        test.change(test.str,test.ch);

        System.out.println(test.str+" and ");
        System.out.println(test.ch);
    }

}
