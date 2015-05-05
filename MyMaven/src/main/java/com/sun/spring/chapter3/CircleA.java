package com.sun.spring.chapter3;

/**
 * Created by SDL on 2015/5/5.
 */
public class CircleA {
    private CircleB circleB;
    public CircleA() {
    }
    public CircleA(CircleB circleB) {
        this.circleB = circleB;
    }
    public void setCircleB(CircleB circleB)
    {
        this.circleB = circleB;
    }
    public void a() {
        circleB.b();
    }
}
