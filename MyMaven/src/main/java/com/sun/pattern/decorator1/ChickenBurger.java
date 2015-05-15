package com.sun.pattern.decorator1;

/**
 * Created by SDL on 2015/5/12.
 */
public class ChickenBurger extends Humburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
