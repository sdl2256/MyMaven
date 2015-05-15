package com.sun.pattern.builder;

/**
 * Created by SDL on 2015/5/12.
 */
public class TestBulider {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        ManBuilder manBuilder = new ManBuilder();

        Person womanPerson = pd.constructPerson(manBuilder);
        System.out.println(womanPerson);
        Person manPerson = pd.constructPerson(new WomanBuilder());
        System.out.println(manPerson);
    }
}
