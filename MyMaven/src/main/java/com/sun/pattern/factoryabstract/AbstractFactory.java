package com.sun.pattern.factoryabstract;

/**
 * Created by SDL on 2015/5/12.
 */
//创建工厂的接口
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
