package com.sun.factory.abstractmodel;

import com.sun.factory.staticmodel.Animal;

/**
 * Created by SDL on 2015/5/6.
 */
public class CattleMilkMother implements MilkAnimalMother {
    public Milk produceMilk() {
        Milk milk=new CattleMile();
        System.out.println("奶牛生产了牛奶");
        return milk;
    }

    public Animal giveBirth() {
        Animal cattle=new Cattle();
        System.out.println("奶牛生了一只小牛");
        return cattle;
    }
}
