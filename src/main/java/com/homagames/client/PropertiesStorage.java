package com.homagames.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesStorage {
    Properties props;
    private static final PropertiesStorage instance = new PropertiesStorage();

    private PropertiesStorage() {
        try (InputStream input = new FileInputStream("config.properties")) {

            props = new Properties();
            props.load(input);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static PropertiesStorage getInstance() {
        return instance;
    }

    public String getProperty(String key) {
        return props.getProperty(key);
    }
}
