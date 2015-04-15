package com.sun.test;

/**
 * Created by SDL on 2015/4/15.
 */
public class TestEncodingBooleans {

    public static void main(String[] args) {
        final int BIT5 = (1<<5);
        final int BIT7 = 0x80;
        final int BITS2AND3 = 12; // 8+4
        int bitmap = 1234567;
        System.out.println(Integer.toBinaryString(bitmap));

        bitmap &= ~BIT7; // bit 7 is now zero
        System.out.println(Integer.toBinaryString(bitmap));

        // clear bits 2, 3 and 5
        bitmap &= ~(BITS2AND3|BIT5);
        System.out.println(Integer.toBinaryString(bitmap));

        bitmap = 1234567;
        boolean bit6Set = ((bitmap & (1<<6)) != 0);
        System.out.println(bit6Set);
    }
}
