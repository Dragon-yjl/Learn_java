package reference;

/**
 * 对象：对象是现实中事物的抽象/建模
 */
class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //1.this肯定不为null，检查obj是不是null
        if(obj == null) {
            return false;
        }
        //2.检查类型，不同的类型，“肯定”代表不了同一个事物
        if(!(obj instanceof Person)) {
            return false;
        }

        //3.根据我们设计类的目的，来判断对象是否代表同一个现实事物
        //名字一样，就代表同一个事物
        Person p = (Person) obj;
        return this.name.equals(p.name);

    }
}

public class TestDemo1 {

    public static void main(String[] args) {

        Person p1 = new Person("gaobo");
        Person p2 = new Person("gaobo");
        Person p3 = new Person("peixig");
        Person p4 = new Person("peixig");

        System.out.println(p1.equals(p2));//false
        //要想让这句代码返回true，就要重写equals方法
        //重写之后就变成了true
        System.out.println(p1.equals(p3));//false

        
    }
}
