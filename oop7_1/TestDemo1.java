package oop7_1;

import sun.security.provider.SHA;

/**
 * 多态
 * 一个引用，能表现出多种不同的形态
 */

class Shape {

    public void draw() {

    }
}

class Cycle extends Shape {

    @Override
    public void draw() {
        System.out.println("画一个○圈！");
    }

}

class Rect extends Shape {

    @Override
    public void draw() {
        System.out.println("画一个♦！");
    }
}

class Flower extends  Shape {

    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}

public class TestDemo1 {

    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {

        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();
        Shape shape3 = new Flower();


        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);

        System.out.println("===========");

        Cycle cycle = new Cycle();
        drawMap(cycle);

    }
}
