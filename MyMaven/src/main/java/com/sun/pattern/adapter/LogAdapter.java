package com.sun.pattern.adapter;

/**
 * Created by SDL on 2015/5/12.
 */
public class LogAdapter implements Ilog {

    private Log log;

    public LogAdapter(Log log) {
        this.log = log;
    }

    public void Write() {
        log.WriteLog();
    }
}
