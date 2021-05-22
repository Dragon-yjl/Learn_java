package test522;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person();//18
        //p1.age = 1;//编译不通过，private

        p1.setAge(10);//10

        System.out.println("年龄为:" + p1.getAge());


        Person p2 = new Person("Tom",21);
        System.out.println("name = "+p2.getName()+",age ="+p2.getAge());
    }
}
