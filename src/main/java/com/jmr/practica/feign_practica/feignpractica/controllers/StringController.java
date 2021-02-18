package com.jmr.practica.feign_practica.feignpractica.controllers;

import com.jmr.practica.feign_practica.feignpractica.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @Autowired
    @Qualifier("ServiceFeign")
    StringService stringService;

    @GetMapping("/test")
    public String test()
    {
        return stringService.test();
    }
}
