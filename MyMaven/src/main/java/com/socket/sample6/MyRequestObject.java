package com.socket.sample6;

import java.io.Serializable;

/**
 * Created by SDL on 2015/4/4.
 * 辅助类MyRequestObject和MyResponseObject，
 * 这两个类是普通的java对象，实现了Serializable接口。
 * MyRequestObject类是Client发出的请求，MyResponseObject是Server端作出的响应。
 */

public class MyRequestObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String value;

    private byte[] bytes;

    public MyRequestObject(String name, String value) {
        this.name = name;
        this.value = value;
        this.bytes = new byte[1024];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Request [name: " + name  + ", value: " + value + ", bytes: " + bytes.length+ "]");
        return sb.toString();
    }
}

