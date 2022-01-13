package com.oop.demo01;

public class Pet {

    public String name;
    public int age;

    public void shout() {
        System.out.println(this.name+"叫了一声!!!");
    }
}


/**
 * public static void main(String[] args) {
 *
 *         Pet dog = new Pet();
 *
 *         dog.name = "旺财";
 *         dog.age = 3;
 *         dog.shout();
 *
 *         System.out.println(dog.name);
 *         System.out.println(dog.age);
 *
 *
 *         Pet cat = new Pet();
 *
 *         cat.shout();
 *         System.out.println(cat.name);
 *         System.out.println(cat.age);
 *
 *     }
 *
 */