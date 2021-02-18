package com.jmr.practica.feign_practica.feignpractica.feign;

import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "strings-practica")
public interface StockFeignRest {

    @GetMapping("/test/connection")
    String testConnection();

    @GetMapping("/all")
    List<Stock> getAll();

    @GetMapping("/{id}")
    Stock getById(@PathVariable long id);

    @GetMapping("brandModel/{idBrandModel}")
    List<Stock> getStockByBrandModel(@PathVariable long idBrandModel);

    @GetMapping("brand/{idBrand}")
    List<Stock> getStockByBrand(@PathVariable long idBrand);

    @PostMapping("/")
    ResponseEntity<Stock> createStock(@RequestBody Stock stock);
}
