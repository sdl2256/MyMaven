package com.sun.pattern.factorymethod;

/**
 * Created by SDL on 2015/5/12.
 */
public class BulbLight implements ILight {
    public void TurnOn() {
        System.out.println("BulbLight TurnOn");
    }

    public void TurnOff() {
        System.out.println("BulbLight TurnOff");

    }
}
