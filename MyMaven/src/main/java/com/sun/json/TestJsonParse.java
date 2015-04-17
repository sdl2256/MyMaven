package com.sun.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * Created by SDL on 2015/4/17.
 */
public class TestJsonParse {
    public static void main(String[] args) {

        String str = "{\"firstName\":\"Brett\",\"lastName\":\"McLaughlin\",\"email\":\"aaaa\"}";
        String str2 = "{\"firstName\":\"Sun\",\"lastName\":\"Jason\",\"email\":\"bbbb\"}";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(str2);

        System.out.println(stringBuilder);
        User user = JSON.parseObject(str, User.class);
        System.out.println(user.getEmail());

        JSONArray jsonArray = JSON.parseArray("[" + stringBuilder + "]");
        System.out.println(jsonArray);

    }
}
