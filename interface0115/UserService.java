package com.oop.interface0115;

// interface 关键字用来定义接口 接口都需要有实现类
public interface UserService {


    // 接口中定义的变量都是常量
    public static final int AGE = 20;


    // 接口中的方法默认都是public abstract 抽象的
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
