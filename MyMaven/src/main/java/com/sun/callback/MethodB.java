package com.sun.callback;

/**
 * Created by SDL on 2015/4/28.
 * 李四编写的程序
 */
public class MethodB {
    public double getTime(CallBackInterface callBack) {
        long start = System.currentTimeMillis();
        callBack.exectueMethod();
        long end = System.currentTimeMillis();
        System.out.println("cost time=" + (end - start));
        return end - start;
    }
}
