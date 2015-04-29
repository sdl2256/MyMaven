package com.sun.util;

/**
 * Created by SDL on 2015/4/29.
 */


import java.util.HashMap;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.exception.*;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PropertyUtil {

    private static final String DEFAULT_PROPERTY = "";
//    private static final String DEFAULT_PROPERTY = "conf";

    private static final String PROPERTY_SUFIX = ".properties";

    private static final Map<String, PropertiesConfiguration> CONFIGURATIONS = new HashMap<String, PropertiesConfiguration>();

    static private Logger logger = LogManager.getLogger(PropertyUtil.class);


    private static PropertiesConfiguration getInstance(String name) {
        String fileName = getPropertyName(name);
//        logger.debug("filename=" + fileName);
        PropertiesConfiguration config = CONFIGURATIONS.get(fileName);
        if (config == null) {
            try {
//                logger.debug("congfig is null");

                config = new PropertiesConfiguration(fileName);
                config.setReloadingStrategy(new FileChangedReloadingStrategy());
                CONFIGURATIONS.put(fileName, config);
            } catch (ConfigurationException e) {
                logger.error("cannot find property file for : " + name);
                throw new RuntimeException("cannot find property file for : " + name);
            }
        }
        return config;
    }

    private static String getPropertyName(String name) {
        if (StringUtils.isBlank(name)) {
            name = DEFAULT_PROPERTY;
        }
        return name.endsWith(PROPERTY_SUFIX) ? name : (name += PROPERTY_SUFIX);
    }

    public static PropertiesConfiguration getInstance() {
        return getInstance(null);
    }

    public static String getString(String key) {
        return getString(key, DEFAULT_PROPERTY);
    }

    public static String getString(String key, String propertyInstance) {
        return getInstance(propertyInstance).getString(key);
    }

    public static int getInt(String key) {
        return getInt(key, DEFAULT_PROPERTY);
    }

    public static int getInt(String key, String propertyInstance) {
        String value = getInstance(propertyInstance).getString(key);
        return Integer.parseInt(value);
    }

    public static void main(String[] args) {
        PropertyUtil test = new PropertyUtil();
        System.out.print(test.getString("key"));
    }

}