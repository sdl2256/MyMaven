package com.sun.util;

/**
 * Created by SDL on 2015/4/17.
 */
public abstract class GetTime {
    public final void getTime() {
        long start = System.currentTimeMillis();
        runcode();
        long end = System.currentTimeMillis();
        System.out.println("运行时间：" + (end - start) + "毫秒");//应该是end - start
    }

    public abstract void runcode();
}
