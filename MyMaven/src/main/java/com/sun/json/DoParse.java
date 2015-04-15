package com.sun.json;

import com.alibaba.fastjson.JSON;
import com.sun.shipxy.SShipInfo;

/**
 * Created by SDL on 2015/4/2.
 */
public class DoParse {
    public static SShipInfo doParseJson(String shipjson){
        return JSON.parseObject(shipjson, SShipInfo.class);
    }
}
