package com.jmr.practica.feign_practica.feignpractica.services;

import com.jmr.practica.entities_practica.libreria_custom_maven_practica.models.entities.Stock;
import com.jmr.practica.feign_practica.feignpractica.feign.StockFeignRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiceStockFeign")
public class StockServiceFeign implements StockService {

    @Autowired
    StockFeignRest stockFeignRest;

    @Override
    public String test() {
        return stockFeignRest.testConnection();
    }

    @Override
    public String testFromStock() {
        return stockFeignRest.testFromStock();
    }

    @Override
    public List<Stock> getAll() {
        return stockFeignRest.getAll();
    }

    @Override
    public Stock getById(long id) {
        return stockFeignRest.getById(id);
    }

    @Override
    public List<Stock> getStockByBrandModel(long idBrandModel) {
        return stockFeignRest.getStockByBrandModel(idBrandModel);
    }

    @Override
    public List<Stock> getStockByBrand(long idBrand) {
        return stockFeignRest.getStockByBrand(idBrand);
    }

    @Override
    public ResponseEntity<Stock> createStock(Stock stock) {
        return stockFeignRest.createStock(stock);
    }
}
