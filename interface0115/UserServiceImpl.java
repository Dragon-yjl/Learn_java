package com.oop.interface0115;

import javax.management.timer.TimerMBean;

// 抽象类用来继承extends ,一个类只能继承一个抽象类
// 接口用来实现 implements 一个类可以实现多个接口
// 实现了接口的类。就需要重写接口中的方法
public class UserServiceImpl implements UserService, TimeService {
    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}
