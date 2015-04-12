package com.javaTest;

import java.util.Scanner;

/**
 * Created by SDL on 2015/4/12.
 */
public class TestScanner {


    public static void test01() {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println("你刚才输入的是：" + str);
    }

    public static void test02() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = s.nextInt();
        System.out.println("再输入一个整数：");
        int b = s.nextInt();

        System.out.println(a+b);

    }
    public static void main(String[] args) {
        test01();
        test02();

    }
}
