package com.sun.spring.chapter3;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SDL on 2015/5/5.
 */
public class TestCircle {

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleByConstructor() throws Throwable {
        try {
            new ClassPathXmlApplicationContext("circleInjectByConstructor.xml");
        } catch (Exception e) {
            //因为要在创建circle3时抛出；
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }

    //测试代码cn.javass.spring.chapter3.CircleTest
    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleBySetterAndPrototype() throws Throwable {
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                    "circleInjectBySetterAndPrototype.xml");
            System.out.println(ctx.getBean("circleA"));
        } catch (Exception e) {
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleBySetterAndSingleton2() throws Throwable {
        try {
            ClassPathXmlApplicationContext ctx =
                    new ClassPathXmlApplicationContext();
            ctx.setConfigLocation("circleInjectBySetterAndSingleton.xml");
            ctx.refresh();
        } catch (Exception e) {
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
