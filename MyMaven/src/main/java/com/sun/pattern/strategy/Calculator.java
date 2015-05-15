package com.sun.pattern.strategy;

/**
 * Created by SDL on 2015/5/12.
 */
public class Calculator {
    private ISalary salary;

    public Calculator(ISalary salary)
    {
        this.salary = salary;
    }

    public double GetSalary()
    {
        return this.salary.CalculateSalary();
    }

}
