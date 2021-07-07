package GenericMethod7_7;

/**
 * 泛型类
 * 泛型本质上是利用Object类型的引用可以指向任意对象的这一前提做到的
 * 隐含着，凡是泛型中的类型变量。一定偶都是引用数据类型
 * @param <T>
 *     1.定义泛型类
 *     public class Person <T>{
 *     2.使用泛型类
 *     public T especial;
 *     3.赋值泛型类
 *     Person<String> p1 = new Person<>("Person",20,"String");
 *
 */
public class Person <T>{
    public String name;
    public int age;

    public T especial;//把T当做一个类型去使用

    public Person(String name, int age, T especial) {
        this.name = name;
        this.age = age;
        this.especial = especial;
    }


    public static void main(String[] args) {

        Person<String> p1 = new Person<>("Person",20,"String");
        Person<Teacher> p2 = new Person<>("Teacher",22,new Teacher());
        Person<Student> p3 = new Person<>("Student",25,new Student());
    }
}
