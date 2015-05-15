package com.sun.pattern.factorymethod;

/**
 * Created by SDL on 2015/5/12.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        ICreator creator1 = new BulbCreator();
        ILight light = creator1.Factory();
        light.TurnOn();
        light.TurnOff();

        creator1 = new TubeCreator();
        light = creator1.Factory();
        light.TurnOn();
        light.TurnOff();
    }
}
