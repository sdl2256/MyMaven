package com.sun.pattern.strategy;

/**
 * Created by SDL on 2015/5/12.
 */
public class ChineseSalary implements ISalary {

    //基本工资
    private static final double BASE_SALARY = 2000;

    //奖金
    private static final double BONUS = 2000;

    public double CalculateSalary() {
        double totalSalary = BASE_SALARY + BONUS;

        double tax = totalSalary * 0.2;

        double salary = totalSalary - tax;

        return salary;
    }
}
