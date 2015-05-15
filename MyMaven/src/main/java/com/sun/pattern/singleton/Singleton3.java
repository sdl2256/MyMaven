package com.sun.pattern.singleton;

/**
 * Created by SDL on 2015/5/12.
 * 基于classloder机制避免了多线程的同步问题,
 * 不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化instance显然没有达到lazy loading的效果。
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
