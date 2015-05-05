package com.sun.spring.chapter3;

/**
 * Created by SDL on 2015/5/5.
 */
public class CircleB {
    private CircleC circleC;
    public CircleB() {
    }
    public CircleB(CircleC circleC) {
        this.circleC = circleC;
    }
    public void setCircleC(CircleC circleC)
    {
        this.circleC = circleC;
    }
    public void b() {
        circleC.c();
    }
}
