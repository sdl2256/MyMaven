package com.sun.pattern.builder;

/**
 * Created by SDL on 2015/5/12.
 */
public class WomanBuilder implements PersonBuilder {
    Person person;

    public WomanBuilder() {
        person = new Woman();
    }

    public void buildBody() {
        person.setBody("建造女人的身体");
    }

    public void buildFoot() {
        person.setFoot("建造女人的脚");
    }

    public void buildHead() {
        person.setHead("建造女人的头");
    }

    public Person buildPerson() {
        return person;
    }
}
