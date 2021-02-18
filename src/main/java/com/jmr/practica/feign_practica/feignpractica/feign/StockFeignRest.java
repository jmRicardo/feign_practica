package com.jmr.practica.feign_practica.feignpractica.feign;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Brand;
import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "strings-practica")
public interface StockFeignRest {

    @GetMapping("/brand/all")
    List<Brand> getAllBrands();

    @GetMapping("/test/connection")
    String testConnection();

    @GetMapping("/stock/test")
    String testFromStock();

    @GetMapping("/stock/all")
    List<Stock> getAll();

    @GetMapping("/stock/{id}")
    Stock getById(@PathVariable long id);

    @GetMapping("/stock/brandModel/{idBrandModel}")
    List<Stock> getStockByBrandModel(@PathVariable long idBrandModel);

    @GetMapping("/stock/brand/{idBrand}")
    List<Stock> getStockByBrand(@PathVariable long idBrand);

    @PostMapping("/stock/")
    ResponseEntity<Stock> createStock(@RequestBody Stock stock);
}
