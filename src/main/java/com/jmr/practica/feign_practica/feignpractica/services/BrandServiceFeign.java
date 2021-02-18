package com.jmr.practica.feign_practica.feignpractica.services;

import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Brand;
import com.jmr.practica.feign_practica.feignpractica.feign.StockFeignRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BrandServiceFeign")
public class BrandServiceFeign implements BrandService{

    @Autowired
    StockFeignRest stockFeignRest;

    @Override
    public List<Brand> getAll() {
        return stockFeignRest.getAllBrands();
    }
}
