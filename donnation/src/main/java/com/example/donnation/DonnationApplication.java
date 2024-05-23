package com.example.donnation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class DonnationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DonnationApplication.class, args);
    }

}
