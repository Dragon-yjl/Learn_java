package com.oop.demo04;

/**
 *  /**
 *      * 封装 : 数据的隐藏 高内聚，低耦合
 *      属性私有，get/set
 *      高内聚就是类的内部数据操作细节自己完成，不允许外部干涉
 *      低耦合就是仅暴露少量的方法给外部使用
 *      * 1.提高程序安全性，保护数据
 *      * 2.隐藏代码的实现细节
 *      * 3.统一接口
 *      * 4.增加系统可维护性
 *      *
 */

public class Student {

    // 封装

    private String name;
    private int age;
    private char sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 120 || age <= 0) {
            System.out.println("年龄不合法！！！");
        }else {
            this.age = age;
        }

    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

/*

 public static void main(String[] args) {

        Student st = new Student();

        st.setName("顾陌");

        st.setSex('男');

        st.setAge(22);

        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getSex());

    }
 */