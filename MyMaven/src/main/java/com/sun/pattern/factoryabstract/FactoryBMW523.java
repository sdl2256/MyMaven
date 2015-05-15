package com.sun.pattern.factoryabstract;

/**
 * Created by SDL on 2015/5/12.
 */
public class FactoryBMW523 implements AbstractFactory {
    public Engine createEngine() {
        return new EngineB();
    }

    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
