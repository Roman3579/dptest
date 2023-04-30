package com.example.demo;

import com.example.demo.config.db.DbConfig;
import com.example.demo.config.db.DbConfigManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		// The call to setupDb() can be commented out during development,
		// however it MUST NOT be commented out in the submitted version
		// of the assignment.
		setupDb();
		SpringApplication.run(DemoApplication.class, args);
	}

	public static void setupDb() throws IOException {
		String jsonConfig = Files.readString(Path.of("db.json"));
		Gson gson = new GsonBuilder().create();
		DbConfig dbConfig = gson.fromJson(jsonConfig, DbConfig.class);
		DbConfigManager.applyDbConfig(dbConfig);
	}

}
