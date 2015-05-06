package com.sun.factory.methodmodel;

import com.sun.factory.staticmodel.Animal;
import com.sun.factory.staticmodel.Dog;

/**
 * Created by SDL on 2015/5/6.
 */
public class DogMother implements AnimalMother {
    public Animal giveBirth() {
        Animal dog = new Dog();
        System.out.println("狗母亲生了一只小狗");
        return dog;
    }
}
