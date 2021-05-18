package test518;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age  = 18;
        p1.sex  = 1;

        p1.study();

        p1.showAge();

        int newage = p1.addAge(2);
        System.out.println(p1.name + "的新年龄:" + newage);

        System.out.println(p1.age);//20

        //*******************//
        Person  p2 = new Person();

        p2.showAge();
        p2.study();
        p2.addAge(10);
        p2.showAge();//10
        p1.showAge();//20
    }

}
