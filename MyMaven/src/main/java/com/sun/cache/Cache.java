package com.sun.cache;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by SDL on 2015/4/22.
 */
public class Cache {
    private ArrayList list = new ArrayList();  //保存从文件中读取的内容
    public Cache(File file){
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line ;
            while((line = br.readLine())!=null){
                list.add(line);

            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLine(int n){
        if(n<0)return null;
        return (String) ((n<list.size())? list.get(n):null);
    }
}
