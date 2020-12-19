package com.example.apisix001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Apisix001Application {
    public static void main(String[] args) {
        System.setProperty("server.port", "18080");// 端口 18080
        SpringApplication.run(Apisix001Application.class, args);
    }

}
