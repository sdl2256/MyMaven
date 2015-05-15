package com.sun.pattern.singleton;

/**
 * Created by SDL on 2015/5/12.
 * 双重校验锁
 */
public class Singleton7 {
    private volatile static Singleton7 singleton7;

    private Singleton7() {
    }

    public static Singleton7 getSingleton7() {
        if (singleton7 == null) {
            synchronized (Singleton7.class) {
                if (singleton7 == null) {
                    singleton7 = new Singleton7();
                }
            }
        }
        return singleton7;
    }

}
