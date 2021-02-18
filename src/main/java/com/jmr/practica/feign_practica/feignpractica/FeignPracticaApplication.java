package com.jmr.practica.feign_practica.feignpractica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class FeignPracticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignPracticaApplication.class, args);
    }

}
