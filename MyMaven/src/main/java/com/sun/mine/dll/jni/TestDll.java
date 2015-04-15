package com.sun.mine.dll.jni;

public class TestDll {
    static {
        System.load("C:\\Test2\\testdll.dll");
    }

    public native static void set(int i);

    public native static int get();

    public static void main(String[] args) {
        TestDll d = new TestDll();
        d.set(10);
        System.out.println(d.get());
    }
}