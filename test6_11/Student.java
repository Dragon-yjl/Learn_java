package test6_11;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Student extends Person{

//    String name;
    String major;
    //    int age;

    public Student() {
    }

    public Student(String name, String major, int age) {
        this.name = name;
        this.major = major;
        //this.age = age;
        setAge(age);
    }

//    //方法
//    public void eat(){
//        System.out.println("吃饭");
//    }
//
//    public void sleep(){
//        System.out.println("睡觉");
//    }

    public void study(){
        System.out.println("学习");
    }
    public  void show(){
        System.out.println("name:" + name + ",age:" + getAge());
    }
}
