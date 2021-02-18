package com.jmr.practica.feign_practica.feignpractica.services;

import com.jmr.practica.feign_practica.feignpractica.feign.StockFeignRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ServiceStockFeign")
public class StockServiceFeign implements StockService {

    @Autowired
    StockFeignRest stringFeignRest;

    @Override
    public String test() {
        return stringFeignRest.testConnection();
    }
}
