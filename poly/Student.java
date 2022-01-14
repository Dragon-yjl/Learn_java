package com.oop.poly;

public class Student extends Person {

    @Override
    public void run() {
        System.out.println("Student run!!!");
    }

    public void eat() {
        System.out.println("Student eat!!!");
    }
}
