package exception;

class Person implements Cloneable{

    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestClone {

    public static void main(String[] args) {
        //CloneNotSupportedException受查异常在，程序将异常处理结束之后，程序才能编译通过
        Person person = new Person("bit");
        try {
            Person person1 =(Person) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("程序才能继续执行");
    }
}
