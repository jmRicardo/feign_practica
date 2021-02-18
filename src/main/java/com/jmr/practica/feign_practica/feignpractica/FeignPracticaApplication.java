package com.jmr.practica.feign_practica.feignpractica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EntityScan({"com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities"})
public class FeignPracticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignPracticaApplication.class, args);
    }

}
