package com.sun.spring.chapter3;

/**
 * Created by SDL on 2015/5/5.
 */
public class CircleC {

    private CircleA circleA;

    public CircleC() {
    }

    public CircleC(CircleA circleA) {
        this.circleA = circleA;
    }

    public void setCircleA(CircleA circleA) {
        this.circleA = circleA;
    }

    public void c() {
        circleA.a();
    }
}
