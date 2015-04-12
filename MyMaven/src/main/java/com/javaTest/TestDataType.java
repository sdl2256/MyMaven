package com.javaTest;

/**
 * Created by SDL on 2015/4/12.
 */
public class TestDataType {

    int t; //实例变量

    public static void main(String[] args) {
        byte b = 127;   //127 default int
        int anInt = 888;
        int anInt8 = 010;
        int anInt16 = 0xf;

        System.out.println(b);
        System.out.println(anInt);
        System.out.println(Integer.toBinaryString(anInt));
        System.out.println(Integer.toOctalString(anInt));
        System.out.println(Integer.toHexString(anInt));

        System.out.println(anInt8);
        System.out.println(anInt16);

        float f= 3.14F;
        double d = 3.14;
        System.out.println(f);
        System.out.println(d);
        System.out.println(f == d);

        char c1 = 'a';
        char c2 = '孙';
        System.out.println(c1);
        System.out.println(c2);
        int a;
       // System.out.println(a);
        a = 5;
        System.out.println(a);

        TestDataType testDataType = new TestDataType();
        System.out.println(testDataType.t);
    }

}
