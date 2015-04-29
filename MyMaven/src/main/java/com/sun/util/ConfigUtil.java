package com.sun.util;

import org.apache.commons.configuration.PropertiesConfiguration;

import java.io.UnsupportedEncodingException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by SDL on 2015/4/29.
 */
public class ConfigUtil {
    private static PropertiesConfiguration config = null;

    static {
        try {
            //config = new PropertiesConfiguration("app.properties");
            //config.setEncoding("UTF-8");
            //config.setHeader(header)
            config = new PropertiesConfiguration();
            config.setEncoding("UTF-8");
            config.load("application.properties");

        } catch (Exception ex) {
        }
    }


    public static int getIntValue(String key) {
        int reInt = 1;
        try {
            //PropertiesConfiguration  config = new PropertiesConfiguration("conf.properties");
            reInt = config.getInt(key);
        } catch (Exception ex) {
            ex.fillInStackTrace();
            reInt = 0;
        }
        return reInt;
    }

    public static Long getLongValue(String key) {
        Long reLong = 1l;
        try {
            //PropertiesConfiguration  config = new PropertiesConfiguration("conf.properties");
            reLong = config.getLong(key);
        } catch (Exception ex) {
            ex.fillInStackTrace();
            reLong = 0l;
        }
        return reLong;
    }


    public static double getDoubleValue(String key) {
        double reDouble = 1.0;
        try {
            //PropertiesConfiguration  config = new PropertiesConfiguration("conf.properties");
            reDouble = config.getDouble(key);
        } catch (Exception ex) {
            ex.fillInStackTrace();
            reDouble = 1.0;
        }
        return reDouble;
    }

    public static String getStringValue(String key) {
        String str = "";
        try {
            //PropertiesConfiguration  config = new PropertiesConfiguration("conf.properties");
            str = config.getString(key);
        } catch (Exception ex) {
            ex.fillInStackTrace();
            str = "";
        }
        return str;
    }

    public static Boolean getBooleanValue(String key) {
        Boolean flag = false;
        try {
            flag = config.getBoolean(key);
        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
        return flag;
    }

    public static void save(String key, Object o) {
        config.setProperty(key, o);
        try {
            //config.save("score.properties");
            config.save("application.properties");
            //config = new PropertiesConfiguration("app.properties");
            config = new PropertiesConfiguration();
            config.setEncoding("UTF-8");
            config.load("application.properties");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("ewew");
        System.out.println(getIntValue("vip.money"));
        //ConfigUtil.save("rmb.money", 20);
        //ConfigUtil.save("month.live", "123334");
        System.out.println(ConfigUtil.getStringValue("month.live1"));
        //System.out.println(getStringValue("month.live"));
    }

    // 读取配置文件
    private static ResourceBundle cache = null;

    static {
        try {
            cache = ResourceBundle.getBundle("application");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /**
     * 功能描述：获取配置文件参数值
     *
     * @param str(参数KEY值)
     * @return
     */
    public static String getValue(String str) {
        String s = cache.getString(str);
        try {
            s = new String(s.getBytes("ISO8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return s;
    }

    /**
     * 功能描述：获取指定配置文件参数的值
     *
     * @param strPropertiesFile(配置文件名称)
     * @param strItem(参数名称)
     * @return
     */
    public String getPropertiesValue(String strPropertiesFile, String strItem) {
        String strItemValue = "";
        ResourceBundle resources1 = null;
        try {
            resources1 = ResourceBundle.getBundle(strPropertiesFile);
            strItemValue = resources1.getString(strItem);
        } catch (MissingResourceException e) {
            System.out.println("ConfigInfo.getPropertiesValue error:"
                    + e.getMessage());
        }
        return strItemValue;
    }

}
