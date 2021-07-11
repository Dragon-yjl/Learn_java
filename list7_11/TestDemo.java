package list7_11;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person {

    int id;
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class TestDemo {

    public static void main(String[] args) {

        Person p1 = new Person("高波");
        Person p2 = new Person("高波");
        Person p3 = new Person("顾陌");

        List<Person> list = new ArrayList<>();

        list.add(p1);
        System.out.println(list.contains(p1));//true

        System.out.println(list.contains(p2));//false
        //因为没有重写equals方法，所以不包含p2
        //重写equals方法之后变成true

        System.out.println(list.indexOf(p2));//-1
        //重写之后变成0

        System.out.println(list.lastIndexOf(p2));//-1
        //重写之后变成0

        System.out.println(list.contains(p3));//false

    }
}
