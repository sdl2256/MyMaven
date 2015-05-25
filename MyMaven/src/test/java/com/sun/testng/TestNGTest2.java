package com.sun.testng;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by SDL on 2015/5/18.
 */
public class TestNGTest2 {
    @Test(enabled = false)
    public void divisionWithException1() {
        System.out.println("Method is not ready yet");
    }

    @Test(timeOut = 1000)
    public void infinity() {
//        while (true);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method1() {
        System.out.println("This is method 1");
    }

    @Test(dependsOnMethods={"method1"})
    public void method2() {
        System.out.println("This is method 2");
    }
}
