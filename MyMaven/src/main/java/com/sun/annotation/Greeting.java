package com.sun.annotation;

import java.lang.annotation.Inherited;

/**
 * Created by SDL on 2015/5/15.
 */
@Inherited
public @interface Greeting {
    public enum FontColor {BULE, RED, GREEN}

    String name();

    FontColor fontColor() default FontColor.GREEN;
}
