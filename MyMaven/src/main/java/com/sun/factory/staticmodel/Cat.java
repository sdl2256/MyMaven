package com.sun.factory.staticmodel;

/**
 * 猫类
 * Created by SDL on 2015/5/6.
 */
public class Cat extends Animal {
    public Cat() {
        // TODO Auto-generated constructor stub
    }

    public Cat(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {

        System.out.println("I like to eat fish!");

    }
}
