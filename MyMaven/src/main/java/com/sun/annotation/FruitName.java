package com.sun.annotation;

import java.lang.annotation.*;

/**
 * Created by SDL on 2015/5/15.
 /**
 * 水果名称注解
 * @author peida
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
