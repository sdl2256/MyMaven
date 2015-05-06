package com.sun.factory;

import com.sun.factory.abstractmodel.CattleMilkMother;
import com.sun.factory.abstractmodel.MilkAnimalMother;
import com.sun.factory.abstractmodel.SheepMilkMother;
import com.sun.factory.methodmodel.AnimalMother;
import com.sun.factory.methodmodel.CatMother;
import com.sun.factory.methodmodel.DogMother;
import com.sun.factory.staticmodel.Animal;
import com.sun.factory.staticmodel.Cat;
import com.sun.factory.staticmodel.Dog;
import com.sun.factory.staticmodel.StaticFatory;
import org.junit.Test;

/**
 * Created by SDL on 2015/5/6.
 */
public class TestCase {
    /**
     * 静态工厂类 测试
     */
    @Test
    public void staticFactoryTest() {
        Animal ani1 = (Animal) StaticFatory.getInstance(Cat.class.getName());
        System.out.println(ani1.getName());
        ani1.eat();
        ani1 = (Animal) StaticFatory.getInstance(Dog.class.getName(), "dog");
        System.out.println(ani1.getName());
        ani1.eat();
    }

    /**
     * 工厂方法模式测试
     */
    @Test
    public void methodFactoryTest(){
        AnimalMother mother=new CatMother();
        mother.giveBirth();
        mother=new DogMother();
        mother.giveBirth();
    }
    /**
     * 抽象工厂模式测试
     */
    @Test
    public void abstrFactoryTest(){
        MilkAnimalMother mother=new SheepMilkMother();
        mother.giveBirth();
        mother.produceMilk();
        mother=new CattleMilkMother();
        mother.giveBirth();
        mother.produceMilk();
    }
}
