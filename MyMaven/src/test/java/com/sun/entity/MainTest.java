package com.sun.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by SDL on 2015/4/20.
 */
public class MainTest {
    @Test
    public void test1() throws Exception {
        ApplicationContext ac=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        User user=(User)ac.getBean("userid");
        Home[] homes=user.getHomes();
        System.out.println("************数组注入***************");
        for(int i=0;i<homes.length;i++){
            System.out.println("家庭地址："+homes[i].getHomeAddr());
        }
        System.out.println("************List注入********************");
        List list=user.getHomesList();
        Iterator ir=list.iterator();
        while(ir.hasNext()){
            //Home home1=(Home)ir.next();
            System.out.println("家庭地址："+ir.next().toString());
        }
        System.out.println("***********Set注入******************");
        Set set=user.getHomesSet();
        Iterator ir1=set.iterator();
        while(ir1.hasNext()){
            System.out.println("家庭地址："+ir1.next().toString());
        }
        System.out.println("************Map注入**************");
        Map map=user.getHomesMap();

        Home home11=(Home)map.get("1");
        System.out.println("家庭地址："+home11.getHomeAddr().toString());
        Home home111=(Home)map.get("2");
        System.out.println("家庭地址："+home111.getHomeAddr().toString());
    }
}
