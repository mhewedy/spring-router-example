package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springrouter.EnableRouter;

@SpringBootApplication
@EnableRouter(controllerPackage = "com.example.demo.controllers",
        modelPackage = "com.example.demo.model")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

