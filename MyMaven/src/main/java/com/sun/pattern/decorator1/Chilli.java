package com.sun.pattern.decorator1;

/**
 * Created by SDL on 2015/5/12.
 */
public class Chilli extends Condiment {
    Humburger humburger;

    public Chilli(Humburger humburger) {
        this.humburger = humburger;

    }

    @Override
    public String getName() {
        return humburger.getName() + " 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice();  //辣椒是免费的哦
    }
}
