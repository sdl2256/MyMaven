package com.sun.annotation;

import java.lang.annotation.*;

/**
 * Created by SDL on 2015/5/15.
 * 　　取值（RetentionPoicy）有：
 * 　1.SOURCE:在源文件中有效（即源文件保留）
 * 　2.CLASS:在class文件中有效（即class保留）
 * 　3.RUNTIME:在运行时有效（即运行时保留）
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column {
    public String name() default "fieldName";
    public String setFuncName() default "setField";
    public String getFuncName() default "getField";
    public boolean defaultDBValue() default false;
}
