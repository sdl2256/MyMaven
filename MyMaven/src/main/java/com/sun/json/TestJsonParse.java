package com.sun.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.sun.shipxy.SShipInfo;

/**
 * Created by SDL on 2015/4/17.
 */
public class TestJsonParse {

    public static void main(String[] args) {
/*
        String str = "{\"firstName\":\"Brett\",\"lastName\":\"McLaughlin\",\"email\":\"aaaa\"}";
        String str2 = "{\"firstName\":\"Sun\",\"lastName\":\"Jason\",\"email\":\"bbbb\"}";

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(str2);

        System.out.println(stringBuilder);
        User user = JSON.parseObject(str, User.class);
        System.out.println(user.getEmail());

        JSONArray jsonArray = JSON.parseArray("[" + stringBuilder + "]");
        System.out.println(jsonArray);

        System.out.println(str);
        System.out.println(str2);
*/

//        String test = "{\"@type\":\"com.shipxy.SShipInfo\",\"callsign\":\"BRWN\",\"cog\":228,\"day\":21,\"dest\":\"ZHU HAI             \",\"draught\":13.3,\"hdg\":0,\"hour\":12,\"imo\":9061576,\"lastTime\":{\"@type\":\"com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl\",\"day\":20,\"eonAndYear\":2014,\"hour\":5,\"millisecond\":-2147483648,\"minute\":40,\"month\":6,\"second\":50,\"timezone\":-2147483648,\"valid\":true,\"xMLSchemaType\":{\"localPart\":\"dateTime\",\"namespaceURI\":\"http://www.w3.org/2001/XMLSchema\",\"prefix\":\"\"},\"year\":2014},\"lat\":23.067778,\"left\":225,\"length\":225,\"lng\":117.199861,\"minute\":0,\"mmsi\":413335000,\"month\":6,\"name\":\"YUE DIAN 4\",\"naviStatus\":15,\"naviStatusCn\":\"\",\"naviStatusEn\":\"\",\"rot\":0,\"shipType\":70,\"shipTypeCn\":\"货船\",\"shipTypeEn\":\"Cargo ship\",\"sog\":11.338444924406048,\"trail\":32,\"width\":32}\n";
        String test =
            "{\"@type\":\"com.shipxy.SShipInfo\",\"callsign\":\"\",\"cog\":57.6,\"day\":0,\"dest\":\"   SHANTOU          \",\"draught\":4.2,\"hdg\":140,\"hour\":24,\"imo\":0,\"lastTime\":{\"@type\":\"com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl\",\"day\":16,\"eonAndYear\":2014,\"hour\":2,\"millisecond\":-2147483648,\"minute\":14,\"month\":6,\"second\":13,\"timezone\":-2147483648,\"valid\":true,\"xMLSchemaType\":{\"localPart\":\"dateTime\",\"namespaceURI\":\"http://www.w3.org/2001/XMLSchema\",\"prefix\":\"\"},\"year\":2014},\"lat\":22.993277,\"left\":33,\"length\":33,\"lng\":116.539077,\"minute\":60,\"mmsi\":412470460,\"month\":0,\"name\":\"YUEDIANTUO5\",\"naviStatus\":0,\"naviStatusCn\":\"在航(主机推动)\",\"naviStatusEn\":\"Under way using engine\",\"rot\":720,\"shipType\":90,\"shipTypeCn\":\"其他类型的船舶\",\"shipTypeEn\":\"Other type of ship\",\"sog\":1.1002159827213822,\"trail\":20,\"width\":10}";
        SShipInfo testObj = JSON.parseObject(test, SShipInfo.class);

//        String shipinfo = "{\"@type\":\"com.shipxy.SShipInfo\",\"callsign\":\"BRWN\",\"cog\":228,\"day\":21,\"dest\":\"ZHU HAI             \",\"draught\":13.3,\"hdg\":0,\"hour\":12,\"imo\":9061576,\"lastTime\":{\"@type\":\"com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl\",\"day\":20,\"eonAndYear\":2014,\"hour\":5,\"millisecond\":-2147483648,\"minute\":40,\"month\":6,\"second\":50,\"timezone\":-2147483648,\"valid\":true,\"xMLSchemaType\":{\"localPart\":\"dateTime\",\"namespaceURI\":\"http://www.w3.org/2001/XMLSchema\",\"prefix\":\"\"},\"year\":2014},\"lat\":23.067778,\"left\":225,\"length\":225,\"lng\":117.199861,\"minute\":0,\"mmsi\":413335000,\"month\":6,\"name\":\"YUE DIAN 4\",\"naviStatus\":15,\"naviStatusCn\":\"\",\"naviStatusEn\":\"\",\"rot\":0,\"shipType\":70,\"shipTypeCn\":\"货船\",\"shipTypeEn\":\"Cargo ship\",\"sog\":11.338444924406048,\"trail\":32,\"width\":32}";

//        System.out.println(shipinfo);
//
//        SShipInfo shipInfo = JSON.parseObject(shipinfo, SShipInfo.class);
//
//
//        String shipxy = "{\"@type\":\"com.shipxy.SShipInfo\",\"callsign\":\"\",\"cog\":57.6,\"day\":0,\"dest\":\"   SHANTOU          \",\"draught\":4.2,\"hdg\":140,\"hour\":24,\"imo\":0," +
//                "\"lastTime\":{\"@type\":\"com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl\",\"day\":16,\"eonAndYear\":2014,\"hour\":2,\"millisecond\":-2147483648,\"minute\":14,\"month\":6,\"second\":13,\"timezone\":-2147483648,\"valid\":true," +
//                "\"xMLSchemaType\":{\"localPart\":\"dateTime\",\"namespaceURI\":\"http://www.w3.org/2001/XMLSchema\",\"prefix\":\"\"}," +
//                "\"year\":2014}," +
//                "\"lat\":22.993277,\"left\":33,\"length\":33,\"lng\":116.539077,\"minute\":60,\"mmsi\":412470460,\"month\":0,\"name\":\"YUEDIANTUO5\",\"naviStatus\":0,\"naviStatusCn\":\"在航(主机推动)\",\"naviStatusEn\":\"Under way using engine\",\"rot\":720,\"shipType\":90," +
//                "\"shipTypeCn\":\"其他类型的船舶\",\"shipTypeEn\":\"Other type of ship\",\"sog\":1.1002159827213822,\"trail\":20,\"width\":10}";
//        System.out.println(shipxy);
//
//        shipInfo = JSON.parseObject(shipxy, SShipInfo.class);
//
//        System.out.println(shipInfo.getName());

    }
}
