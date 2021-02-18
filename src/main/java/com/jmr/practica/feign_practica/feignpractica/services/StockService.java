package com.jmr.practica.feign_practica.feignpractica.services;

import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Stock;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StockService {

    String test();

    String testFromStock();

    List<Stock> getAll();

    Stock getById(long id);

    List<Stock> getStockByBrandModel(long idBrandModel);

    List<Stock> getStockByBrand(long idBrand);

    ResponseEntity<Stock> createStock(Stock stock);
}
