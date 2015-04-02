package com.json;

import com.alibaba.fastjson.JSON;
import com.shipxy.SShipInfo;

/**
 * Created by SDL on 2015/4/2.
 */
public class DoParse {
    public static SShipInfo doParseJson(String shipjson){
        return JSON.parseObject(shipjson, SShipInfo.class);
    }
}
