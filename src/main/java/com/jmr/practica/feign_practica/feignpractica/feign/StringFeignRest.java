package com.jmr.practica.feign_practica.feignpractica.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "strings-practica")
public interface StringFeignRest {

    @GetMapping("/test/connection")
    String testConnection();
}
