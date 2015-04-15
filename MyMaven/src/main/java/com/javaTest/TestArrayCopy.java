package com.javaTest;

import java.util.Arrays;

/**
 * Created by SDL on 2015/4/14.
 */
public class TestArrayCopy {

    public static void main(String[] args) {
//        byte[] bytes = new byte[10];
        byte[] bytes = {'1','2','3','4','5','6','7','8','9','0'};

        byte[] destBuf = new byte[5];

        System.arraycopy(bytes, 3, destBuf, 0, destBuf.length);

        System.out.println("新的数组长度：" + destBuf.length);
        System.out.println("复制出的数组为：" + new String(destBuf));

        destBuf = Arrays.copyOfRange(bytes,3,destBuf.length);
        System.out.println("新的数组为：" + new String(destBuf));
        System.out.println("新的数组长度：" + destBuf.length);


        String str = "   very good   ";
        String s = str.trim();
        System.out.println(s + " : " + s.length());
    }
}
