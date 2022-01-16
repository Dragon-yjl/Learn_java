package com.oop.outIntClass0116;

public class Test {

    public static void main(String[] args) {

        Apple apple = new Apple(); // 正常实例化一个对象

        // 没有名字初始化类,不用将实例保存到变量中~
        new Apple().eat();



    }


}


class Apple{
    public void eat() {
        System.out.println("1");
    }
}
