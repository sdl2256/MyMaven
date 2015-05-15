package com.sun.pattern.decorator;

/**
 * Created by SDL on 2015/5/12.
 */
public class TestDecorator {
    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(
                new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }
}
