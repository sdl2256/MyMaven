package com.sun.factory.abstractmodel;

/**
 * Created by SDL on 2015/5/6.
 */
public abstract class Milk {
    String name;

    public Milk() {
    }

    public Milk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
