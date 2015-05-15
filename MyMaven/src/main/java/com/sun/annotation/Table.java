package com.sun.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by SDL on 2015/5/15.
 */
@Target(ElementType.TYPE)
public @interface Table {
    /**
     * 数据表名称注解，默认值为类名称
     *
     * @return
     */
    public String tableName() default "className";
}
