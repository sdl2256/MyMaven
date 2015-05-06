package com.sun.factory.staticmodel;

/**
 * 静态工厂模式：顾名思义就知道他是用静态方法实现的，其创建的对象具有一定的特性，譬如说是某类的派生或者某接口的实现
 *
 * Created by SDL on 2015/5/6.
 *
 * 动物类
 */
public abstract class Animal {
    private String name;

    public Animal() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
