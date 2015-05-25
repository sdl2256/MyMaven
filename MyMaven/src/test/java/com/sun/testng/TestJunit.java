package com.sun.testng;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SDL on 2015/5/18.
 */
public class TestJunit {
    @Test
    public void testAdd() {
        String str= "Junit testing using TestNG";
        assertEquals("Junit testing using TestNG",str);
    }
}
