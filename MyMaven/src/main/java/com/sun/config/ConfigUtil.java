package com.sun.config;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by SDL on 2015/4/29.
 */
public class ConfigUtil {
    public static String getFileIO(String name, String fileURL) {
        Properties prop = new Properties();
        InputStream in = ConfigUtil.class.getResourceAsStream(fileURL);
        try {
            prop.load(in);
            return prop.getProperty(name);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void writeData(String key, String value, String fileURL) {
        Properties prop = new Properties();
        InputStream fis = null;
        OutputStream fos = null;

        URL url = ConfigUtil.class.getResource(fileURL);
        try {
            File file = new File(fileURL);
            if (!file.exists()) {
                file.createNewFile();
            }
            fis = new FileInputStream(file);
            prop.load(fis);
            fis.close();//一定要在修改值之前关闭fis

            fos = new FileOutputStream(file);
            prop.setProperty(key, value);
            prop.store(fos, "Update '" + key + "' value");
            fos.close();

        } catch (IOException e) {
            System.err.println("Visit " + fileURL + " for updating " + value + " value error");
        } finally {
            try {

                if (fos != null)
                    fos.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
//        ConfigUtil.getFileIO("name", "gxyTest.properties");
        String fileURL = "gxyTest.properties";
        ConfigUtil.writeData("name", "microsoft", fileURL);
        System.out.println(ConfigUtil.getFileIO("name", fileURL));
    }
}
