package Test617;

/*封装性
降低类的调用者对类 的学习成本

*/

/**
 * 1.用private关键字修饰成员变量
 * 2.private私有的，被其修饰之后，只能在当前类当中使用
 * 3.每个类中都会预留公有的接口的，一旦你把这个方法设置为
 * public,那么就不要轻易去修改它的属性为其他属性
 */


class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("我叫"+name+"年龄"+this.age);
    }

    public String getName() {
        return name;
    }

//    public void setName(String myName) {
//        name = myName;
//    }

    public void setName(String name) {
        name = name;//自己给自己赋值，局部变量优先，与成员变量毫无关系，调用之后运行结果为null
        this.name = name;
        //换成this.name = name 就可以继续调用，set赋值，get打印了
        //this 理解为当前对象的引用
    }

    //表示自己重写的打印的方法
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class EncapsulationTest {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "顾陌";
//        System.out.println(student.name);//输出 顾陌

        //当我用private在类中进行封装以后，就不能这样调用了
        //要想接着使用，就要在类中定义get，set方法,然后通过调用方法实现，如下

        student.setAge(10);
        System.out.println(student.getAge());
        student.setName("顾陌");
        System.out.println(student.getName());//输出 顾陌

        //Student{age=10, name='顾陌'}用自己写的toString方法打印的

        System.out.println(student);//Test617.Student@1b6d3586
        //Student当前引用的类型  @后面的是当前的引用的哈希值

    }

}
