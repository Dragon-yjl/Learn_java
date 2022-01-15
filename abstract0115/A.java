package com.oop.abstract0115;

// 子类必须要实现父类的抽象方法   除非子类也是抽象类
public class A extends Action {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
}
