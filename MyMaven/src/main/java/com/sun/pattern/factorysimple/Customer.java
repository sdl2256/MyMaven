package com.sun.pattern.factorysimple;

/**
 * Created by SDL on 2015/5/12.
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        bmw320.product();
        BMW bmw523 = factory.createBMW(523);
        bmw523.product();
    }
}
