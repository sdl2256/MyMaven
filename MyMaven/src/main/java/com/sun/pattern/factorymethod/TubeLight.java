package com.sun.pattern.factorymethod;

/**
 * Created by SDL on 2015/5/12.
 */
public class TubeLight implements ILight {
    public void TurnOn() {
        System.out.println("TubeLight TurnOn");
    }

    public void TurnOff() {
        System.out.println("TubeLight TurnOff");

    }
}
