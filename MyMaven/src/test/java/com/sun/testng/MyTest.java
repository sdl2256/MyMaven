package com.sun.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertNotNull;

/**
 * Created by SDL on 2015/5/18.
 */
public class MyTest {
    private int count = 0;
    private boolean success = false;

    @BeforeMethod
    public void init() {

    }

    @Test(groups = {"unit", "jms"})
    public void send() {
        System.out.println("send...");
    }

    @Test(dataProvider = ("test-name"), invocationCount = 1000, threadPoolSize = 10)
    public void test(String name) {
//        System.out.println(name);
        assertNotNull(name);
    }


    @DataProvider(name = "test-name")
    public Object[][] getTestName() {
        return new Object[][]{
//                {"Tom"},
//                {"Jarry"},
//                {"Andy"},
//                {"Xiaowang"},
                {"Xiaoli"}
        };
    }


    @Test(groups = "send", invocationCount = 1000, dataProvider = ("test-name"), threadPoolSize = 10)
    public void sendMessage(String name) {
        System.out.println(name);
    }

    @Test(timeOut = 10000, dependsOnGroups = "send", invocationCount = 1000, successPercentage = 98, threadPoolSize = 10)
    public void waitForAnswer() {
//        while (!success) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        }
    }
}
