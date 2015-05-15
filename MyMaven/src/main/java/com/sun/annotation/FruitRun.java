package com.sun.annotation;

/**
 * Created by SDL on 2015/5/15.
 */
public class FruitRun {
    public static void main(String[] args) {
//        Apple apple = new Apple();
//        apple.displayName();
//
//        AppleService appleService = new AppleService();
//        appleService.showTaste();
//        appleService.showTaste(0);
//        appleService.showTaste(2);

        FruitInfoUtil.getFruitInfo(AppleAnnotation.class);
    }
}
