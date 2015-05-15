package com.sun.pattern.decorator1;

/**
 * Created by SDL on 2015/5/12.
 */
public abstract class Humburger {
    protected String name;
    public String getName(){
        return name;
    }

    public abstract double getPrice();
}
