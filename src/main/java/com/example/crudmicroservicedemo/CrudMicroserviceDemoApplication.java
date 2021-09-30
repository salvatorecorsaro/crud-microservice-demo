package com.example.crudmicroservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CrudMicroserviceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudMicroserviceDemoApplication.class, args);
    }

}
