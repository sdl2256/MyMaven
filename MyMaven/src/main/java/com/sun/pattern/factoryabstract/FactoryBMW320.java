package com.sun.pattern.factoryabstract;

/**
 * Created by SDL on 2015/5/12.
 */
//为宝马320系列生产配件
public class FactoryBMW320 implements AbstractFactory {
    public Engine createEngine() {
        return new EngineA();
    }

    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
