package com.sun.pattern.adapter;

/**
 * Created by SDL on 2015/5/12.
 */
public class FileLog extends Log {

    @Override
    public void WriteLog() {
        System.out.println("called File log");
    }
}
