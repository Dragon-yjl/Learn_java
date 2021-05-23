package test523;

import java.util.stream.Stream;

/*
* this关键字的使用
* 1.this可以用来修饰：属性，方法，构造器
*
* 2.this修饰属性和方法
*   this理解为，当前对象或当前正在创建的对象
*   2.1 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象
*   属性或方法，但是，通常情况下，我们选择省略"this."特殊情况下，如果方法的
*   形参和类的属性同名时，我们必须显示的使用"this.变量"的方式，表明此变量是
*   属性，而非形参。
*
*   2.2 在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象
 *   属性或方法，但是，通常情况下，我们选择省略"this."特殊情况下，如果构造器的
 *   形参和类的属性同名时，我们必须显示的使用"this.变量"的方式，表明此变量是
 *   属性，而非形参。
 *
 *3.this调用构造器（用来代替其他构造器里面的冗余代码）
 *  3.1我们在类的构造器中，可以显示的使用"this.(形参列表)"的 方式，调用本类中指定的其他构造器
 *  3.2构造器中不能通过"this.(形参列表)"方式调用自己
 *  3.3如果一个类中有n个构造器，则最多有n-1个构造器中使用了"this.(形参列表)"
 *  3.4规定，"this.()"必须声明在当前构造器的首行
 *  3.5构造器内部 ，最多只能有一个"this.()"用来调用其他构造器
 *
* */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(1);
        p1. eat();

        System.out.println(p1.getAge());

    }
}

    class Person {

        private String name;
        private int age;

        //构造器

        public  Person(){

            this.eat();
        }

        public Person(String name){
            this();//表示调用上面空参的构造器啊
            this.name = name;
        }

        public Person(int age){
            this.age = age;
        }

        public  Person(String name,int age){
            this(age);//表示调用上面的形参是age的构造器
            this.name = name;
            //this.age = age;
            //执行this(age);的时候已经执行了上面这行

        }
        //*************方法*******************
        public void setName(String name) {

            this.name = name;
            //不加this对应形参里面的name，加了this对应private修饰的name
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }
        public void eat(){
            System.out.println("人吃饭");
            study();
        }
        public void study(){
            System.out.println("人学习");
        }
    }

