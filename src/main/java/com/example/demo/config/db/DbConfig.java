package com.example.demo.config.db;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DbConfig {
    private String dialect;
    private String ddlAuto;
    private String url;
    private String username;
    private String password;

}


