package com.sun.util;

import com.alibaba.fastjson.JSON;
import com.sun.shipxy.SShipInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SDL on 2015/4/17.
 */
public class OneThreadReadFile extends Thread {

    BufferedReader br = null;

    public OneThreadReadFile(BufferedReader br) {
        this.br = br;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public List<String> readFromFile(BufferedReader br) {
        List<String> callsignList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();


        List<SShipInfo> shipList = new ArrayList<SShipInfo>();
        String lineText = new String();

        int count = 0;

        try {
            while ((lineText = br.readLine()) != null && count < 10000) {
                SShipInfo shipInfo = JSON.parseObject(lineText, SShipInfo.class);
//                shipList.add(shipInfo);

                String callsign = shipInfo.getCallsign();
                if (!callsignList.contains(callsign)) {
                    callsignList.add(callsign);
                    System.out.println(callsign);
                    count++;
//                stringBuilder.append(lineText);
//                System.out.println("line-----" + count);

                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
/*
        System.out.println(stringBuilder.toString());
        System.out.println("---------------------------------------------");
        System.out.println(stringBuilder.substring(0).toString());
        System.out.println("---------------------------------------------");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("[" + stringBuilder.substring(1).toString() + "]");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
*/
//        JSONArray jsonArray = JSON.parseArray("[" + stringBuilder.substring(1).toString() + "]");
/*
        System.out.println("*********************************************");
        System.out.println(jsonArray);
        System.out.println("*********************************************");
*/
//        List<String> stringList = new ArrayList<String>();
//
//        for (SShipInfo ship : shipList) {
//            System.out.println("船舶呼号：" + ship.getCallsign() + "   报告时间：" + ship.getLastTime());
////            try {
////                Date date = DateUtil.convertToDate(ship.getLastTime());
////                Date now = new Date();
////                System.out.println(now.getTime() - date.getTime());
////
////                long time = date.getTime();
////                System.out.println(time);
////            } catch (Exception e) {
////                e.printStackTrace();
////            }
//        }


        return null;
    }

    @Override
    public void run() {
        readFromFile(br);
    }
}
