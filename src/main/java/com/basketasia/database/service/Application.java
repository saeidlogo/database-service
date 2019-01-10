/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basketasia.database.service;

import java.io.InputStream;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 *
 */
@Startup
@Singleton
public class Application {

    Properties properties;

    @PostConstruct
    public void init() {
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("application.properties");

            properties = new Properties();
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getConfigurationValue(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    public String getConfigurationValue(String key) {
        return getConfigurationValue(key, null);
    }

}
