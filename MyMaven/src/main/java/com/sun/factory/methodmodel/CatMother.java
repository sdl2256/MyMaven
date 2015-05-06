package com.sun.factory.methodmodel;


import com.sun.factory.staticmodel.Animal;
import com.sun.factory.staticmodel.Cat;

/**
 * Created by SDL on 2015/5/6.
 */
public class CatMother implements AnimalMother {
    public Animal giveBirth() {
        Animal cat=new Cat();
        System.out.println("猫母亲生了一只小猫眯");
        return cat;
    }
}
