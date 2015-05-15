package com.sun.pattern.builder;

/**
 * Created by SDL on 2015/5/12.
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
