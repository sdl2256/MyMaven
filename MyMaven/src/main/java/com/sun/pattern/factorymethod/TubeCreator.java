package com.sun.pattern.factorymethod;

/**
 * Created by SDL on 2015/5/12.
 */
public class TubeCreator implements ICreator {
    public ILight Factory() {
        return new TubeLight();
    }
}
