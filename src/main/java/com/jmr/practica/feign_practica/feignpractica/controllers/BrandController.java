package com.jmr.practica.feign_practica.feignpractica.controllers;

import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Brand;
import com.jmr.practica.feign_practica.feignpractica.services.BrandService;
import com.jmr.practica.feign_practica.feignpractica.services.BrandServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    @Qualifier("BrandServiceFeign")
    BrandService brandService;

    @GetMapping("/all")
    public List<Brand> all()
    {
        return brandService.getAll();
    }
}
