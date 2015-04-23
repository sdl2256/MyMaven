package com.sun.cache;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SDL on 2015/4/22.
 */
public class CacheTest {
    private Cache cache;

    public static void main(String[] args) {

        CacheTest t = new CacheTest();
        File file = new File("F:\\ideaTestspace\\UDPClientSim\\src\\main\\resources\\shipInfo.txt");
        long start = System.currentTimeMillis();
        t.search1(file, "//.+");   //匹配注释
        System.out.println("没有用缓存耗时：" + (System.currentTimeMillis() - start) + "MS");

        start = System.currentTimeMillis();
        t.search2(file, "//.+");   //匹配注释
        System.out.println("用缓存耗时：" + (System.currentTimeMillis() - start) + "MS");
    }

    public void search1(File file, String pattern) {  //不使用缓存
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            Pattern searched = Pattern.compile(pattern);
            Matcher lm;
            int lines = 0; //记录注释行数
            while ((line = br.readLine()) != null) {
                lm = searched.matcher(line);
                if (lm.find()) lines++;
            }
            System.out.println(lines);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void search2(File file, String pattern) { //使用缓存，

        if (cache == null)
            cache = new Cache(file);
        String line;
        Pattern searched = Pattern.compile(pattern);
        Matcher lm;
        int i = 0;
        int lines = 0;
        while ((line = cache.getLine(i++)) != null) {
            lm = searched.matcher(line);
            if (lm.find()) lines++;
        }
        System.out.println(lines);

    }


}
