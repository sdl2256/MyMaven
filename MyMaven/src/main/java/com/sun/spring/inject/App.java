package com.sun.spring.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by SDL on 2015/5/5.
 */
public class App {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        Customer cust = (Customer)context.getBean("CustomerBean");
        System.out.println(cust);

    }
}
