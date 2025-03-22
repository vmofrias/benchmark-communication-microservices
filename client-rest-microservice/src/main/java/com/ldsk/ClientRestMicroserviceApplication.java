package com.ldsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientRestMicroserviceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ClientRestMicroserviceApplication.class, args);
    }
}