package com.sun.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SDL on 2015/5/15.
 */
public class FruitService {
    @SuppressWarnings(value = {"rawtypes", "unchecked"})
    public static List<Fruit> getFruitList() {
        List<Fruit> fruitList = new ArrayList();
        return fruitList;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static List<Fruit> getFruit() {
        List<Fruit> fruitList = new ArrayList();
        return fruitList;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
    }
}
