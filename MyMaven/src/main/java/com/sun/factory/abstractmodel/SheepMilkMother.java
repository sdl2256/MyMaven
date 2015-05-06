package com.sun.factory.abstractmodel;

import com.sun.factory.staticmodel.Animal;

/**
 * Created by SDL on 2015/5/6.
 */
public class SheepMilkMother implements MilkAnimalMother {
    public Milk produceMilk() {
        Milk milk = new SheepMilk();
        System.out.println("奶羊生产了羊奶");
        return milk;
    }

    public Animal giveBirth() {
        Animal sheep = new Sheep();
        System.out.println("奶羊生了一只小羊");
        return sheep;
    }
}
