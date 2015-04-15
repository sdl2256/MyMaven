package com.sun.json;

import com.sun.shipxy.SShipInfo;
import org.junit.Test;

/**
 * Created by SDL on 2015/4/2.
 */
public class TestJson {

//    private Json shipxy;
//
//    @Before
//    public void setUp() throws Exception {
//        shipxy = new Json();
//        shipxy.setJsonstr("{\"@type\":\"com.sun.shipxy.SShipInfo\",\"callsign\":\"BYFT\",\"cog\":144,\"day\":18,\"dest\":\"SURIGAO\",\"draught\":7,\"hdg\":0,\"hour\":20,\"imo\":9592874,\"lastTime\":{\"@type\":\"com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl\",\"day\":18,\"eonAndYear\":2014,\"hour\":10,\"millisecond\":-2147483648,\"minute\":17,\"month\":6,\"second\":28,\"timezone\":-2147483648,\"valid\":true,\"xMLSchemaType\":{\"localPart\":\"dateTime\",\"namespaceURI\":\"http://www.w3.org/2001/XMLSchema\",\"prefix\":\"\"},\"year\":2014},\"lat\":9.527917,\"left\":188,\"length\":188,\"lng\":125.899444,\"minute\":0,\"mmsi\":413466860,\"month\":6,\"name\":\"YUE DIAN 59\",\"naviStatus\":15,\"naviStatusCn\":\"\",\"naviStatusEn\":\"\",\"rot\":0,\"shipType\":79,\"shipTypeCn\":\"货船\",\"shipTypeEn\":\"Cargo ship\",\"sog\":0.5384449244060475,\"trail\":29,\"width\":32}");
//    }

    @Test
    public void testJson() {
        SShipInfo shipInfo;
        try {
            String shipxy = "{\"@type\":\"com.sun.shipxy.SShipInfo\",\"callsign\":\"BYFE\",\"cog\":101,\"day\":14,\"dest\":\"MUARA PANTAI        \",\"draught\":7.5,\"hdg\":276,\"hour\":12,\"imo\":9475595,\"lastTime\":{\"@type\":\"com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl\",\"day\":19,\"eonAndYear\":2014,\"hour\":4,\"millisecond\":-2147483648,\"minute\":59,\"month\":6,\"second\":52,\"timezone\":-2147483648,\"valid\":true,\"xMLSchemaType\":{\"localPart\":\"dateTime\",\"namespaceURI\":\"http://www.w3.org/2001/XMLSchema\",\"prefix\":\"\"},\"year\":2014},\"lat\":1.908,\"left\":190,\"length\":190,\"lng\":118.142833,\"minute\":0,\"mmsi\":414008000,\"month\":6,\"name\":\"YUEDIAN 58\",\"naviStatus\":1,\"naviStatusCn\":\"锚泊\",\"naviStatusEn\":\"At anchor\",\"rot\":0,\"shipType\":70,\"shipTypeCn\":\"货船\",\"shipTypeEn\":\"Cargo ship\",\"sog\":0.09913606911447084,\"trail\":30,\"width\":32}";
//            shipInfo = JSON.parseObject(shipxy, SShipInfo.class);
            shipInfo = DoParse.doParseJson(shipxy);
            System.out.println(shipInfo);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }
}
