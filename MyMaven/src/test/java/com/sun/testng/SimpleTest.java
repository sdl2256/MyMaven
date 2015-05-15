package com.sun.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by SDL on 2015/5/15.
 */

public class SimpleTest {

    @BeforeClass
    public void setUp() {
        System.out.println("Init method.");
        // code that will be invoked when this test is instantiated.
    }

    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("Slow test");
    }

    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        System.out.println(str);
        assertEquals("TestNG is working fine", str);
    }
}
