package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient; // Enables this application to be a discovery client 

@SpringBootApplication
@EnableDiscoveryClient // 
public class RestRibbonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestRibbonServerApplication.class, args);
    }
}