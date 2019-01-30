package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springrouter.EnableRouter;

@SpringBootApplication
@EnableScheduling
@EnableRouter(controllerPackage = "com.example.demo.controllers",
        modelPackage = "com.example.demo.model")
public class DemoApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

