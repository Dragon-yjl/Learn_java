package test6_11;

public class Person extends Creature{
    //属性
    String name;
    private int age;//就算是private也能被继承

    //构造器
    public Person() {

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
