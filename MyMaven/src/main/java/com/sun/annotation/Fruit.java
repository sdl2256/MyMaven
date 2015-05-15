package com.sun.annotation;

/**
 * Created by SDL on 2015/5/15.
 */
public class Fruit {
    public void displayName() {
        System.out.println("水果的名字是：*****");
    }
}

class Orange extends Fruit {
    @Override
    public void displayName() {
        System.out.println("水果的名字是：桔子");
    }
}

class Apple extends Fruit {
    @Override
    public void displayName() {
        System.out.println("水果的名字是：苹果");
    }
}