package com.sun.test;

/**
 * Created by SDL on 2015/4/12.
 */
public class TestBreakContinue {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("begin");
        while (true) {
            total++;
            int i = (int) (100 * Math.random());
            if (i == 88)
                break;
        }
        System.out.println(total);
        System.out.println("end");


        //打印出101~150 之间的质数
        int count = 0;
        outer:
        for (int i = 101; i <= 150; i++) {
            for (int m = 2; m < i / 2; m++) {
                if (i % m == 0) {
                    continue outer;
                }
            }
            count++;
            System.out.print(i + "\t");
        }

        System.out.println("\n" + count);
        System.out.println("*******************");

        count = 0;
        outer:for (int i = 101; i <= 150; i++) {
            for (int m = 2; m < i / 2; m++) {
                if (i % m == 0) {
                    break outer;
                }
            }
            count++;
            System.out.print(i + "\t");
        }
        System.out.println("\n" + count);
    }
}
