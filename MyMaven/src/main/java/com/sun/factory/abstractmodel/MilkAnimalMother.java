package com.sun.factory.abstractmodel;

import com.sun.factory.methodmodel.AnimalMother;

/**
 * Created by SDL on 2015/5/6.
 *
 * 抽象工厂模式：前面工厂方法模式是比较具体的，是猫肯定生的是小猫，这是不会有问题的，是具体的，
 * 那么抽象工厂它所产生的就不是那么具体，产生的对象可能是没有共同特性的。
 *
 * 譬如说 一只奶羊不仅仅能够生小羊，同时也能生产羊奶，但小羊是动物，羊奶是食物。
 */
public interface MilkAnimalMother extends AnimalMother {
    /**
     * 产奶
     *
     * @return
     */
    public Milk produceMilk();
}
