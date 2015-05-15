package com.sun.pattern.singleton;

/**
 * Created by SDL on 2015/5/12.
 */
public class Singleton4 {
    private static Singleton4 instance = null;

    static {
        instance = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
