package com.sun.callback;

/**
 * Created by SDL on 2015/4/28.
 */
public class B implements MyCallInterface{
    public void method()
    {
        System.out.println("回调");
    }

    public static void main(String args[])
    {
        Caller call = new Caller();
        call.setCallfuc(new B());
        call.call();
    }
}
