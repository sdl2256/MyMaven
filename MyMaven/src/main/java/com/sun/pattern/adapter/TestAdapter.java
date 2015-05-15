package com.sun.pattern.adapter;

/**
 * Created by SDL on 2015/5/12.
 */
public class TestAdapter {
    public static void main(String[] args) {
        LogAdapter logAdapter = new LogAdapter(new DatabaseLog());
        logAdapter.Write();
        logAdapter = new LogAdapter(new FileLog());
        logAdapter.Write();
    }
}
