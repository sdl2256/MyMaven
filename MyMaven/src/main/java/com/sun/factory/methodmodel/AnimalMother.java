package com.sun.factory.methodmodel;

import com.sun.factory.staticmodel.Animal;

/**
 * 母亲接口
 *
 * Created by SDL on 2015/5/6.
 * 工厂方法模式：
 * 其主要是对各个类型的东西分类生产，但分类生产的对象仍然是具有某一特性的。
 * 譬如说：前面的静态工厂类是一个综合造车工厂，不管是汽车还是火车都能生产，
 * 而工厂方法模式就是工厂具体分工，造汽车的工厂只造汽车，造火车的只造火车，
 * 不管造汽车还是火车但造出来的还是车。
 *
 * 具体代码例子如下：（这里的例子和上面的例子是一起的，具狗生好多小狗，猫生好多小猫的例子，如果不具体那么是母动物都能生的）
 */
public interface AnimalMother {

    /**
     * 生育动物
     *
     * @return
     */
    public Animal giveBirth();
}
