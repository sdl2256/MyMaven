package com.sun.callback;

/**
 * Created by SDL on 2015/4/28.
 */
public class Caller {
    public MyCallInterface mc;

    public void setCallfuc(MyCallInterface mc)
    {
        this.mc= mc;
    }

    public void call(){
        this.mc.method();
    }
}
