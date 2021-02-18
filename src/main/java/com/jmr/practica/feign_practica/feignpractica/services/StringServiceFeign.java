package com.jmr.practica.feign_practica.feignpractica.services;

import com.jmr.practica.feign_practica.feignpractica.feign.StringFeignRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ServiceFeign")
public class StringServiceFeign implements StringService {

    @Autowired
    StringFeignRest stringFeignRest;

    @Override
    public String test() {
        return stringFeignRest.testConnection();
    }
}
