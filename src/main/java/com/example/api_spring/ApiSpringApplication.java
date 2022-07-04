package com.example.api_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(scanBasePackages = {"com.example.api_spring"})
public class ApiSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiSpringApplication.class, args);
    }

}
