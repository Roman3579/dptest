package com.example.demo.config.db;

public class DbConfigManager {
    public static void applyDbConfig(DbConfig dbConfig){
        System.setProperty("spring.jpa.properties.hibernate.dialect", dbConfig.getDialect());
        System.setProperty("spring.jpa.hibernate.ddl-auto", dbConfig.getDdlAuto());
        System.setProperty("spring.datasource.url", dbConfig.getUrl());
        System.setProperty("spring.datasource.username", dbConfig.getUsername());
        System.setProperty("spring.datasource.password", dbConfig.getPassword());
    }
}
