package com.sun.serializable;

import java.io.Serializable;

/**
 * Created by SDL on 2015/4/24.
 */
public class Person implements Serializable {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
