package com.jmr.practica.feign_practica.feignpractica.controllers;

import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Stock;
import com.jmr.practica.feign_practica.feignpractica.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    @Qualifier("ServiceStockFeign")
    StockService stringService;

    @GetMapping("/test")
    public String testFromStock()
    {
        return stringService.testFromStock();
    }

    @GetMapping("/connnection")
    public String test()
    {
        return stringService.test();
    }

    @PostMapping("/create")
    public void createStock(@RequestBody Stock stock)
    {
        stringService.createStock(stock);
    }

    @GetMapping("/all")
    public List<Stock> getAll()
    {
        return stringService.getAll();
    }
}
