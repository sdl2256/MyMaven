package com.sun.pattern.decorator;

/**
 * Created by SDL on 2015/5/12.
 */
public class Decorator_first extends Decorator {
    public Decorator_first(Human human) {
        super(human);
    }
    public void goClothespress() {
        System.out.println("去衣柜找找看。。");
    }

    public void findPlaceOnMap() {
        System.out.println("在Map上找找。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findPlaceOnMap();
    }
}
