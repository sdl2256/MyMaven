package com.sun.factory;

/**
 * Created by SDL on 2015/5/6.
 */
interface Product {
}

interface Creator {
    public Product factory();
}

class ConcreteProduct1 implements Product {
    public ConcreteProduct1() {
        System.out.println("ConcreteProduct1被创建");
    }
}

class ConcreteProduct2 implements Product {
    public ConcreteProduct2() {
        System.out.println("ConcreteProduct2被创建");
    }

}

class ConcreteCreator1 implements Creator {
    public Product factory() {
        return new ConcreteProduct1();
    }
}

class ConcreteCreator2 implements Creator {
    public Product factory() {
        return new ConcreteProduct2();
    }
}

public class MethodFactoryClient {
    private static Creator creator1, creator2;
    private static Product prod1, prod2;

    public static void main(String[] args) {
        creator1 = new ConcreteCreator1();
        prod1 = creator1.factory();
        System.out.println("----------------------------");
        creator2 = new ConcreteCreator2();
        prod2 = creator2.factory();
    }
}
