package edu.vt.unitrade;
/*
 * Created by Nicolas Turner
 * Copyright © 2025 Nicolas Turner. All rights reserved.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream(".env")) { // or "config.properties" if you're using that
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getApiKeyServiceA() {
        return properties.getProperty("api.key.service.a");
    }

    public static String getApiKeyServiceB() {
        return properties.getProperty("api.key.service.b");
    }

    public static String getDatabaseUrl() {
        return properties.getProperty("database.url");
    }
}