package com.example.apisix001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Apisix002Application {

    public static void main(String[] args) {
        System.setProperty("server.port", "28080"); // 端口 28080
        SpringApplication.run(Apisix002Application.class, args);
    }

}
