package com.sun.pattern.strategy;

/**
 * Created by SDL on 2015/5/12.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ChineseSalary());
        System.out.println("中国工资" + calculator.GetSalary());
        calculator = new Calculator(new AmericanSalary());
        System.out.println("美国工资" + calculator.GetSalary());

    }
}

