package com.sun.pattern.singleton;

import sun.misc.SignalHandler;

/**
 * Created by SDL on 2015/5/12.
 * 静态内部类
 * 利用了classloder的机制来保证初始化instance时只有一个线程
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
